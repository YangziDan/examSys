package com.exam.mapper.zzw;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.FillQuestion;
import com.exam.entity.MultiQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 选择题题库表(MultiQuestion)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-09 14:21:14
 */
@Mapper
public interface MultiQuestionMapper extends BaseMapper<MultiQuestion> {

    /**
     * select * from multiquestions where questionId in (
     * 	select questionId from papermanage where questionType = 1 and paperId = 1001
     * )
     */
    @Select("select * from multi_question where questionId in (select questionId from paper_manage where questionType = 1 and paperId = #{paperId})")
    List<MultiQuestion> findByIdAndType(Integer paperId);

    @Select("select * from multi_question")
    IPage<MultiQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     * @return MultiQuestion
     */
    @Select("select questionId from multi_question order by questionId desc limit 1")
    MultiQuestion findOnlyQuestionId();

    /**
     *  mybatis主键自增长，注解返回主键：@Options()
     * @param multiQuestion
     * @return int
     */
    @Options(useGeneratedKeys = true,keyProperty = "questionId")
    @Insert("insert into multi_question(subject,question,answerA,answerB,answerC,answerD,rightAnswer,analysis,section,level) " +
            "values(#{subject},#{question},#{answerA},#{answerB},#{answerC},#{answerD},#{rightAnswer},#{analysis},#{section},#{level})")
    int add(MultiQuestion multiQuestion);

    /**
     * 注：rand()随机数
     * @param subject
     * @param pageNo
     * @return List
     */
    @Select("select questionId from multi_question  where subject =#{subject} order by rand() desc limit #{pageNo}")
    List<Integer> findBySubject(String subject,Integer pageNo);


    @Select("select * from multi_question where questionId=#{questionId}")
    MultiQuestion findByQuestionId(Integer questionId);
}

