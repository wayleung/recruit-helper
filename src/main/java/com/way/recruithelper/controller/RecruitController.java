package com.way.recruithelper.controller;

import com.way.recruithelper.model.param.PostListParam;
import com.way.recruithelper.model.vo.ResponseVo;
import com.way.recruithelper.service.TencentRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayleung
 * @description
 * @date 2020-12-21 11:05:07
 */
@RestController
public class RecruitController {
    @Autowired
    TencentRecruitService tencentRecruitService;

    @PostMapping("/getDetailList")
    ResponseVo getDetailList(@RequestBody PostListParam param){
        return tencentRecruitService.getDetailList(param);
    }
}
