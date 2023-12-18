package com.exam.service.zzw;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.entity.ExamManage;

import java.util.List;

/**
 * 考试管理表(ExamManage)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 15:06:30
 */
public interface ExamManageService extends IService<ExamManage> {
    /**
     * 不分页查询所有考试信息
     */
    List<ExamManage> findAll();

    /**
     * 分页查询
     * @param page
     * @return
     */
    IPage<ExamManage> findAll(Page<ExamManage> page);

    ExamManage findById(Integer examCode);

    int delete(Integer examCode);
    int deleteByPaperId(Integer paperId);
    int update(ExamManage exammanage);

    int add(ExamManage exammanage);

    ExamManage findOnlyPaperId();

}
