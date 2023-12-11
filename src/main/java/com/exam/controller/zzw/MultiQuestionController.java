package com.exam.controller.zzw;


import com.exam.entity.MultiQuestion;
import com.exam.service.zzw.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 选择题题库表(MultiQuestion)表控制层
 *
 * @author makejava
 * @since 2023-12-09 14:21:14
 */
@RestController
@RequestMapping("/multiQuestion")
public class MultiQuestionController {

    @Autowired
    private MultiQuestionService multiQuestionService;

    @GetMapping("/getMultiQuestion")
    public MultiQuestion getMultiQuestionByQuestionId(@RequestParam Integer questionId){
        return multiQuestionService.findByQuestionId(questionId);
    }

}

