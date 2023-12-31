package com.exam.controller;

import com.exam.Result.ApiResult;
import com.exam.Result.ApiResultHandler;
import com.exam.entity.Admin;
import com.exam.entity.Login;
import com.exam.entity.Student;
import com.exam.service.serviceimpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录控制器
 * 只获取用户数据
 * 校验用户身份交由前端处理
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @PostMapping("/login")
    public ApiResult login(@RequestBody Login login) {
        Integer username = login.getUsername();
        String password = login.getPassword();
        Admin adminRes = loginService.adminLogin(username, password);
        if (adminRes != null) {
            return ApiResultHandler.buildApiResult(200, "请求成功", adminRes);
        }

        Student studentRes = loginService.studentLogin(username,password);
        if (studentRes != null) {
            return ApiResultHandler.buildApiResult(200, "请求成功", studentRes);
        }

        return ApiResultHandler.buildApiResult(400, "请求失败", null);
    }
}
