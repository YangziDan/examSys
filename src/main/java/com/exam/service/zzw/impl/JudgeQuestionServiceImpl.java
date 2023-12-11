package com.exam.service.zzw.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.entity.FillQuestion;
import com.exam.entity.JudgeQuestion;
import com.exam.mapper.zzw.JudgeQuestionMapper;
import com.exam.service.zzw.JudgeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 判断题题库表(JudgeQuestion)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 14:20:29
 */
@Service("judgeQuestionService")
public class JudgeQuestionServiceImpl extends ServiceImpl<JudgeQuestionMapper, JudgeQuestion> implements JudgeQuestionService {
    @Autowired
    private JudgeQuestionMapper judgeQuestionMapper;

    @Override
    public List<JudgeQuestion> findByIdAndType(Integer paperId) {
        return judgeQuestionMapper.findByIdAndType(paperId);
    }

    @Override
    public IPage<JudgeQuestion> findAll(Page<JudgeQuestion> page) {
        return judgeQuestionMapper.findAll(page);
    }

    @Override
    public JudgeQuestion findOnlyQuestionId() {
        return judgeQuestionMapper.findOnlyQuestionId();
    }

    @Override
    public int add(JudgeQuestion judgeQuestion) {
        return judgeQuestionMapper.add(judgeQuestion);
    }

    @Override
    public List<Integer> findBySubject(String subject, Integer pageNo) {
        return judgeQuestionMapper.findBySubject(subject,pageNo);
    }

    @Override
    public JudgeQuestion findByQuestionId(Integer questionId) {
        return judgeQuestionMapper.findByQuestionId(questionId);
    }
}
