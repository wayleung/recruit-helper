package com.way.recruithelper.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.way.recruithelper.model.constant.Code;
import com.way.recruithelper.model.param.PostDetailParam;
import com.way.recruithelper.model.param.PostListParam;
import com.way.recruithelper.model.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 14:41:26
 */
@Service
public class TencentRecruitServiceImpl implements TencentRecruitService {

    public static final String TENCENT_LIST_URL = "https://careers.tencent.com/tencentcareer/api/post/Query";

    public static final String TENCENT_DETAIL_URL = "https://careers.tencent.com/tencentcareer/api/post/ByPostId";

    /**
     * 获取职位列表（腾讯招聘接口）
     * @param param
     * @return
     */
    @Override
    public ResponseVo getPostList(PostListParam param){
        if(ObjectUtil.isNotNull(param)){
            Map paramMap = JSON.parseObject(JSON.toJSONString(param), Map.class);
            String result = HttpUtil.get(TENCENT_LIST_URL, paramMap);
            ResponseVo responseVo = JSON.parseObject(result, ResponseVo.class);
            return responseVo;
        }else{
            return new ResponseVo();
        }
    }

    /**
     * 获取职位详情（腾讯招聘接口）
     * @param param
     * @return
     */
    @Override
    public ResponseVo getDetail(PostDetailParam param){
        if(ObjectUtil.isNotNull(param)){
            Map paramMap = JSON.parseObject(JSON.toJSONString(param), Map.class);
            String result = HttpUtil.get(TENCENT_DETAIL_URL, paramMap);
            ResponseVo responseVo = JSON.parseObject(result, ResponseVo.class);
            return responseVo;
        }else{
            return new ResponseVo();
        }
    }

    /**
     * 获取详细职位列表
     *
     * @param param
     * @return
     */
    @Override
    public ResponseVo getDetailList(PostListParam param) {
        ResponseVo responseVo = getPostList(param);
        ResponseVo returnVo = new ResponseVo();
        returnVo.setCode(responseVo.getCode());
        if(Code.SUCCESS.equals(responseVo.getCode())){
            DataVo data = (DataVo) responseVo.getData();
            List<PostListVo> posts = data.getPosts();
            if(CollectionUtil.isNotEmpty(posts)){
                List<PostDetailListVo> detailPosts = new ArrayList<>(posts.size());
                for (int i = 0; i < posts.size(); i++) {
                    PostListVo item = posts.get(i);
                    String postId = item.getPostId();
                    PostDetailParam detailParam = new PostDetailParam();
                    detailParam.setPostId(postId);
                    ResponseVo detail = getDetail(detailParam);
                    PostDetailVo detailVo = (PostDetailVo) detail.getData();
                    PostDetailListVo detailListVo = new PostDetailListVo();
                    BeanUtils.copyProperties(detailVo,detailListVo);
                    detailListVo.setRequirement(detailVo.getRequirement());
                    detailPosts.add(detailListVo);
                }
                returnVo.setData(detailPosts);
            }
        }
        return returnVo;
    }
}
