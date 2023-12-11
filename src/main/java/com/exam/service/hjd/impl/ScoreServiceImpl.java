package com.exam.service.hjd.impl;

import com.exam.entity.Score;
import com.exam.mapper.hjd.ScoreMapper;
import com.exam.service.hjd.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public List<Score> getAllScoreByStudentId(Integer studentId) {
        List<Score> scoreList = scoreMapper.findAllScoreByStudentId(studentId);
        return scoreList;
    }
}
