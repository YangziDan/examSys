package com.exam.service.serviceimpl;

import com.exam.entity.UserInfo;
import com.exam.mapper.UserInfoMapper;
import com.exam.service.UserInfoService;
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
