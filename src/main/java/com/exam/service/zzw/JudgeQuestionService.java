package com.exam.service.zzw;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.entity.JudgeQuestion;

import java.util.List;

/**
 * 判断题题库表(JudgeQuestion)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 14:20:28
 */
public interface JudgeQuestionService extends IService<JudgeQuestion> {
    List<JudgeQuestion> findByIdAndType(Integer paperId);

    IPage<JudgeQuestion> findAll(Page<JudgeQuestion> page);

    JudgeQuestion findOnlyQuestionId();

    int add(JudgeQuestion judgeQuestion);

    List<Integer> findBySubject(String subject,Integer pageNo);

    JudgeQuestion findByQuestionId(Integer questionId);

}
