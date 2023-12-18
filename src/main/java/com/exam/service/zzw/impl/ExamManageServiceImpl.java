package com.exam.service.zzw.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.entity.ExamManage;
import com.exam.mapper.zzw.ExamManageMapper;
import com.exam.service.zzw.ExamManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 考试管理表(ExamManage)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 15:06:31
 */
@Service("examManageService")
public class ExamManageServiceImpl extends ServiceImpl<ExamManageMapper, ExamManage> implements ExamManageService {
    @Autowired
    private ExamManageMapper examManageMapper;


    @Override
    public List<ExamManage> findAll() {
        return examManageMapper.findAll();
    }

    @Override
    public IPage<ExamManage> findAll(Page<ExamManage> page) {
        return examManageMapper.findAll(page);
    }

    @Override
    public ExamManage findById(Integer examCode) {
        return examManageMapper.findById(examCode);
    }

    @Override
    public int delete(Integer examCode) {
        return examManageMapper.delete(examCode);
    }

    @Override
    public int deleteByPaperId(Integer paperId) {return examManageMapper.deleteByPaperId(paperId);}

    @Override
    public int update(ExamManage exammanage) {
        return examManageMapper.update(exammanage);
    }

    @Override
    public int add(ExamManage exammanage) {
        return examManageMapper.add(exammanage);
    }

    @Override
    public ExamManage findOnlyPaperId() {
        return examManageMapper.findOnlyPaperId();
    }
}
