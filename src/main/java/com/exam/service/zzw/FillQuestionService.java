package com.exam.service.zzw;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.entity.FillQuestion;

import java.util.List;

/**
 * 填空题题库(FillQuestion)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 14:19:53
 */
public interface FillQuestionService extends IService<FillQuestion> {

    FillQuestion findByQuestionId(Integer questionId);

    List<FillQuestion> findByIdAndType(Integer paperId);

    IPage<FillQuestion> findAll(Page<FillQuestion> page);

    FillQuestion findOnlyQuestionId();

    int add(FillQuestion fillQuestion);

    List<Integer> findBySubject(String subject,Integer pageNo);
}
