package com.exam.mapper.hjd;

import com.exam.entity.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreMapper {
    @Select("select * from score where studentId=#{studentId}")
    List<Score> findAllScoreByStudentId(Integer studentId);
}
