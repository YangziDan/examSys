package com.exam.controller.hjd;

import com.exam.entity.WrongQuestion;
import com.exam.service.hjd.WrongQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wrongQuestion")
public class WrongQuestionController {

    @Autowired
    WrongQuestionService wrongQuestionService;

    @GetMapping("/getWrongQuestion")
    public List<WrongQuestion> getAllWrongQuestionByStudentId(@RequestParam Integer studentId){
       return wrongQuestionService.getAllWrongQuestionByStudentId(studentId);
    }

    @PostMapping("/setStatus")
    public Boolean setWrongQuestionStatus(Integer type,Integer questionId,Integer studentId,Integer status){
//        System.out.println(type+questionId+studentId+status);
        return wrongQuestionService.setStatus(type,questionId,studentId,status);
    }
}
