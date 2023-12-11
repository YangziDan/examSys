package com.exam.service.hjd.impl;

import com.exam.entity.Question;
import com.exam.entity.WrongQuestion;
import com.exam.mapper.hjd.WrongQuestionMapper;
import com.exam.service.hjd.WrongQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrongQuestionServiceImpl implements WrongQuestionService {

    @Autowired
    private WrongQuestionMapper wrongQuestionMapper;

    @Override
    public List<WrongQuestion> getAllWrongQuestionByStudentId(Integer studentId) {
        List<WrongQuestion> wrongQuestionList = wrongQuestionMapper.findAllWrongQuestionByStudentId(studentId);
        for(WrongQuestion wrongQuestion:wrongQuestionList){
            Integer type=wrongQuestion.getType();
            Integer questionId=wrongQuestion.getQuestionId();
            Question question=null;
            if(type==1){
                 question=wrongQuestionMapper.findFillQuestionByQuestionId(questionId);
            }else if(type==2){
                 question=wrongQuestionMapper.findJudgeQuestionByQuestionId(questionId);
            }else if(type==3) {
                 question=wrongQuestionMapper.findMultiQuestionByQuestionId(questionId);
            }
            wrongQuestion.setQuestion(question);
        }
        return wrongQuestionList;
    }

    @Override
    public Boolean setStatus(Integer type, Integer questionId, Integer studentId, Integer status) {
        return wrongQuestionMapper.setStatus(type,questionId,studentId,status);
    }

}
