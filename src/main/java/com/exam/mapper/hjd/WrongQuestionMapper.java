package com.exam.mapper.hjd;

import com.exam.entity.FillQuestion;
import com.exam.entity.JudgeQuestion;
import com.exam.entity.MultiQuestion;
import com.exam.entity.WrongQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface WrongQuestionMapper {

    @Select("select * from wrong_question where studentId=#{studentId}")
    List<WrongQuestion> findAllWrongQuestionByStudentId(Integer studentId);

    @Select("select * from fill_question where questionId=#{questionId}")
    FillQuestion findFillQuestionByQuestionId(Integer questionId);
    @Select("select * from judge_question where questionId=#{questionId}")
    JudgeQuestion findJudgeQuestionByQuestionId(Integer questionId);
    @Select("select * from multi_question where questionId=#{questionId}")
    MultiQuestion findMultiQuestionByQuestionId(Integer questionId);

    @Update("update wrong_question set status=#{status} where type=#{type} and questionId=#{questionId} and studentId=#{studentId}")
    Boolean setStatus(Integer type,Integer questionId,Integer studentId,Integer status);
}
