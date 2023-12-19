package com.exam.service.zjh.impl;

import com.exam.entity.Admin;
import com.exam.mapper.zjh.AdminInfoMapper;
import com.exam.service.zjh.AdminInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {
    @Resource
    private AdminInfoMapper adminInfoMapper;

    @Override
    public void savaManageInfo(Admin admin){
        adminInfoMapper.updateManage(admin);
    }

    @Override
    public Admin selectAdmin(Admin admin){
        return adminInfoMapper.selectAdmin(admin);
    }
}
