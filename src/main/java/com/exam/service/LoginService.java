package com.exam.service;

import com.exam.entity.Admin;
import com.exam.entity.Student;

public interface LoginService {

    public Admin adminLogin(Integer username, String password);


    public Student studentLogin(Integer username, String password);
}
