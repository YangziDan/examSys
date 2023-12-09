package com.exam.service.zzw;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.entity.MultiQuestion;

import java.util.List;

/**
 * 选择题题库表(MultiQuestion)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 14:21:14
 */
public interface MultiQuestionService extends IService<MultiQuestion> {

    List<MultiQuestion> findByIdAndType(Integer PaperId);

    IPage<MultiQuestion> findAll(Page<MultiQuestion> page);

    MultiQuestion findOnlyQuestionId();

    int add(MultiQuestion multiQuestion);

    List<Integer> findBySubject(String subject,Integer pageNo);
}
