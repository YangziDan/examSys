package com.exam.controller.zzw;


import com.exam.Result.ApiResult;
import com.exam.Result.ApiResultHandler;
import com.exam.entity.FillQuestion;
import com.exam.entity.JudgeQuestion;
import com.exam.entity.MultiQuestion;
import com.exam.entity.PaperManage;
import com.exam.service.zzw.FillQuestionService;
import com.exam.service.zzw.JudgeQuestionService;
import com.exam.service.zzw.MultiQuestionService;
import com.exam.service.zzw.PaperManageService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 试卷管理表(PaperManage)表控制层
 *
 * @author makejava
 * @since 2023-12-09 14:06:30
 */
@RestController
@RequestMapping("paperManage")
public class PaperManageController {

    @Resource
    private PaperManageService paperManageService;
    @Resource
    private JudgeQuestionService judgeQuestionService;
    @Resource
    private MultiQuestionService multiQuestionService;
    @Resource
    private FillQuestionService fillQuestionService;

    @GetMapping("/papers")
    public ApiResult<PaperManage> findAll() {
        ApiResult res = ApiResultHandler.buildApiResult(200, "请求成功", paperManageService.findAll());
        return res;
    }

    /**
     * 查询试卷
     * @param paperId
     * @return Map
     */
    @GetMapping("/paper/{paperId}")
    public Map<Integer, List<?>> findById(@PathVariable("paperId") Integer paperId) {
        System.out.println("试卷ID：" + paperId);
        List<MultiQuestion> multiQuestionRes = multiQuestionService.findByIdAndType(paperId);   //选择题题库 1
        List<FillQuestion> fillQuestionsRes = fillQuestionService.findByIdAndType(paperId);     //填空题题库 2
        List<JudgeQuestion> judgeQuestionRes = judgeQuestionService.findByIdAndType(paperId);   //判断题题库 3

        //Map封装
        Map<Integer, List<?>> map = new HashMap<>();
        map.put(1,multiQuestionRes);
        map.put(2,fillQuestionsRes);
        map.put(3,judgeQuestionRes);
        return  map;
    }

    @PostMapping("/paperManage")
    public ApiResult add(@RequestBody PaperManage paperManage) {
        int res = paperManageService.add(paperManage);
        if (res != 0) {
            return ApiResultHandler.buildApiResult(200,"添加成功",res);
        }
        return ApiResultHandler.buildApiResult(400,"添加失败",res);
    }

}

