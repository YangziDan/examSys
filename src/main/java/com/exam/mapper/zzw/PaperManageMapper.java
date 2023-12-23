package com.exam.mapper.zzw;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.entity.PaperManage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 试卷管理表(PaperManage)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-09 14:06:31
 */
@Mapper
public interface PaperManageMapper extends BaseMapper<PaperManage> {

    @Select("select paperId, questionType,questionId from paper_manage")
    List<PaperManage> findAll();

    @Select("select paperId, questionType,questionId from paper_manage where paperId = #{paperId}")
    List<PaperManage> findById(Integer paperId);

    @Insert("insert into paper_manage(paperId,questionType,questionId) values " +
            "(#{paperId},#{questionType},#{questionId})")
    int add(PaperManage paperManage);

    @Delete("delete from paper_manage where paperId = #{paperId} and questionId = #{questionId} and questionType = #{questionType}")
    void del(PaperManage paperManage);
}

