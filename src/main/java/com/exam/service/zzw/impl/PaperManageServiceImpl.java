package com.exam.service.zzw.impl;


import com.exam.entity.PaperManage;
import com.exam.mapper.zzw.PaperManageMapper;
import com.exam.service.zzw.PaperManageService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * 试卷管理表(PaperManage)表服务实现类
 *
 * @author makejava
 * @since 2023-12-09 14:06:46
 */
@Service("paperManageService")
public class PaperManageServiceImpl extends ServiceImpl<PaperManageMapper, PaperManage>
        implements PaperManageService {

    @Resource
    private PaperManageMapper paperMapper;
    @Override
    public List<PaperManage> findAll() {
        return paperMapper.findAll();
    }

    @Override
    public List<PaperManage> findById(Integer paperId) {
        return paperMapper.findById(paperId);
    }

    @Override
    public int add(PaperManage paperManage) {
        return paperMapper.add(paperManage);
    }

}
