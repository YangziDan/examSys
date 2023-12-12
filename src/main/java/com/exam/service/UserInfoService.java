package com.exam.service;

import com.exam.entity.UserInfo;

public interface UserInfoService {

    public UserInfo selectInfo(UserInfo userInfo);

    public void insertInfo(UserInfo userInfo);

    public void updateInfo(UserInfo userInfo);


}
