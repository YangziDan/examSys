package com.exam.service.hjd;


import com.exam.entity.WrongQuestion;

import java.util.List;
import java.util.Map;

public interface WrongQuestionService {
    List<WrongQuestion> getAllWrongQuestionByStudentId(Integer studentId);

    Boolean setStatus(Integer type,Integer questionId,Integer studentId,Integer status);
}
