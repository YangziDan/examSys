package com.exam.controller.zjh;

import com.exam.entity.Admin;
import com.exam.entity.UserInfo;
import com.exam.service.zjh.impl.AdminInfoServiceImpl;
import com.exam.service.zjh.impl.UserInfoServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SaveInfoController {
    @Resource
    private UserInfoServiceImpl userInfoService;

    @Resource
    private AdminInfoServiceImpl adminInfoService;
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

    @PostMapping("/push")
    public UserInfo pushInfo(@RequestBody UserInfo userInfo){
        return userInfoService.selectInfo(userInfo);
    }

    @PostMapping("/saveManageInfo")
    public void saveManageInfo(@RequestBody Admin admin){
        adminInfoService.savaManageInfo(admin);
    }

    @PostMapping("/pushManageInfo")
    public Admin pushManageInfo(@RequestBody Admin admin){
        return adminInfoService.selectAdmin(admin);
    }

}
