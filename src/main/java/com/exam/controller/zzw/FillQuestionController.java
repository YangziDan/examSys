package com.exam.controller.zzw;


import com.exam.entity.FillQuestion;
import com.exam.service.zzw.FillQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 填空题题库(FillQuestion)表控制层
 *
 * @author makejava
 * @since 2023-12-09 14:19:49
 */
@RestController
@RequestMapping("/fillQuestion")
public class FillQuestionController {

    @Autowired
    private FillQuestionService fillQuestionService;

    @GetMapping("/getFillQuestion")
    public FillQuestion getFillQuestionByQuestionId(@RequestParam Integer questionId){
        return fillQuestionService.findByQuestionId(questionId);
    }


}

