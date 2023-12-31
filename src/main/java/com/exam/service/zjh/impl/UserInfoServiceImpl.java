package com.exam.service.zjh.impl;

import com.exam.entity.UserInfo;
import com.exam.mapper.zjh.UserInfoMapper;
import com.exam.service.zjh.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;


    @Override
    public UserInfo selectInfo(UserInfo userInfo){
        return userInfoMapper.infoSelect(userInfo);
    }

    @Override
    public void insertInfo(UserInfo userInfo){
        userInfoMapper.infoInsert(userInfo);
    }

    @Override
    public void updateInfo(UserInfo userInfo){
        userInfoMapper.infoUpdate(userInfo);
    }



}
