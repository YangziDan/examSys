package com.exam.service.zzw.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.entity.FillQuestion;
import com.exam.entity.MultiQuestion;
import com.exam.mapper.zzw.MultiQuestionMapper;
import com.exam.service.zzw.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 选择题题库表(MultiQuestion)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 14:21:14
 */
@Service("multiQuestionService")
public class MultiQuestionServiceImpl extends ServiceImpl<MultiQuestionMapper, MultiQuestion> implements MultiQuestionService {
    @Autowired
    private MultiQuestionMapper multiQuestionMapper;

    /**
     * ID 查询
     * @param PaperId
     * @return
     */
    @Override
    public List<MultiQuestion> findByIdAndType(Integer PaperId) {
        return multiQuestionMapper.findByIdAndType(PaperId);
    }

    /**
     * 分页查询所有
     * @param page
     * @return IPage<MultiQuestion>
     */
    @Override
    public IPage<MultiQuestion> findAll(Page<MultiQuestion> page) {
        return multiQuestionMapper.findAll(page);
    }

    @Override
    public MultiQuestion findOnlyQuestionId() {
        return multiQuestionMapper.findOnlyQuestionId();
    }

    @Override
    public int add(MultiQuestion multiQuestion) {
        return multiQuestionMapper.add(multiQuestion);
    }

    @Override
    public List<Integer> findBySubject(String subject, Integer pageNo) {
        return multiQuestionMapper.findBySubject(subject,pageNo);
    }

    @Override
    public MultiQuestion findByQuestionId(Integer questionId) {
        return multiQuestionMapper.findByQuestionId(questionId);
    }
}
