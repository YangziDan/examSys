package com.exam.controller;

import com.exam.entity.UserInfo;
import com.exam.service.serviceimpl.UserInfoServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SaveInfoController {
    @Resource
    private UserInfoServiceImpl userInfoService;
    @PostMapping("/save")
    public String save(@RequestBody UserInfo userInfo){
        if ((userInfoService.selectInfo(userInfo)!=null)){
            userInfoService.updateInfo(userInfo);
            return "更新成功";
        }
        else{
            userInfoService.insertInfo(userInfo);
            return "插入成功";
        }

    }
}
