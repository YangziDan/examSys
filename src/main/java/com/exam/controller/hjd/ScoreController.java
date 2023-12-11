package com.exam.controller.hjd;

import com.exam.entity.Score;

import com.exam.service.hjd.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getScore")
    public List<Score> getAllStudentScoreByStudentId(@RequestParam Integer studentId){
        return scoreService.getAllScoreByStudentId(studentId);
    }
}
