package com.exam.controller.zzw;


import com.exam.entity.JudgeQuestion;
import com.exam.service.zzw.JudgeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 判断题题库表(JudgeQuestion)表控制层
 *
 * @author makejava
 * @since 2023-12-09 14:20:25
 */
@RestController
@RequestMapping("/judgeQuestion")
public class JudgeQuestionController {

    @Autowired
    private JudgeQuestionService judgeQuestionService;

    @GetMapping("/getJudgeQuestion")
    public JudgeQuestion getJudgeQuestionByQuestionId(@RequestParam Integer questionId){
        return judgeQuestionService.findByQuestionId(questionId);
    }
}

