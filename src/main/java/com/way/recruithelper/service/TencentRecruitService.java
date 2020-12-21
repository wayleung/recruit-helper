package com.way.recruithelper.service;

import com.way.recruithelper.model.param.PostDetailParam;
import com.way.recruithelper.model.param.PostListParam;
import com.way.recruithelper.model.vo.ResponseVo;

/**
 * @author wayleung
 * @description 腾讯招聘
 * @date 2020-12-21 10:21:39
 */
public interface TencentRecruitService {

    /**
     * 获取职位列表（腾讯招聘接口）
     * @param param
     * @return
     */
    ResponseVo getPostList(PostListParam param);

    /**
     * 获取职位详情（腾讯招聘接口）
     * @param param
     * @return
     */
    ResponseVo getDetail(PostDetailParam param);

    /**
     * 获取详细职位列表
     * @param param
     * @return
     */
    ResponseVo getDetailList(PostListParam param);
}
