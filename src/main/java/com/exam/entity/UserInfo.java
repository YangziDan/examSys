package com.exam.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
    private Integer userId;
    private String userName;
    private String userSex;
    private String userPhone;
    private String userSchool;
    private String userImg;
}
