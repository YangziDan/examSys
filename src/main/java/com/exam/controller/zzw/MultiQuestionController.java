package com.exam.controller.zzw;


import com.exam.entity.MultiQuestion;
import com.exam.mapper.zzw.MultiQuestionMapper;
import com.exam.service.zzw.MultiQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private MultiQuestionMapper multiQuestionMapper;
    @PostMapping("/addMultiQuestion")
    public void addMultiQuestion(@RequestBody MultiQuestion multiQuestion){
        multiQuestionMapper.add2(multiQuestion);
    }
    @PostMapping("/delMultiQuestion")
    public void delMultiQuestion(@RequestBody MultiQuestion question){
        multiQuestionMapper.deleteById(question.getQuestionId());
    }
}

