package com.exam.service.hjd;

import com.exam.entity.Score;

import java.util.List;

public interface ScoreService {
    List<Score> getAllScoreByStudentId(Integer studentId);

}
