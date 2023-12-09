package com.exam.service.zzw;


import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.entity.PaperManage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 试卷管理表(PaperManage)表服务接口
 *
 * @author makejava
 * @since 2023-12-09 14:06:46
 */
public interface PaperManageService extends IService<PaperManage> {

    /**
     * 试卷列表
     * @return
     */
    public List<PaperManage> findAll();

    /**
     * 根据id查找试卷
     * @param paperId
     * @return
     */
    List<PaperManage> findById(Integer paperId);

    /**
     * 新增试卷
     * @param paperManage
     * @return
     */
    int add(PaperManage paperManage);
}
