package com.exam.entity;

import lombok.Data;

@Data
public class WrongQuestion {
    private Integer questionId;
    private Integer type;//1为填空 2为判断 3为选择
    private Integer studentId;
    private Integer status;//0表示未重做,1表示已重做

    private Question question;
}
