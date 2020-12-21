package com.way.recruithelper.tencent.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.way.recruithelper.tencent.model.param.PostDetailParam;
import com.way.recruithelper.tencent.model.param.PostListParam;
import com.way.recruithelper.tencent.model.vo.ResponseVo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 14:41:26
 */
@NoArgsConstructor
@Data
public class TencentRecruitHttpclient {

    public static final String URL_LIST = "https://careers.tencent.com/tencentcareer/api/post/Query";

    public static final String URL_DETAIL = "https://careers.tencent.com/tencentcareer/api/post/ByPostId";

    public static void main(String[] args) {
        PostListParam param = PostListParam.builder().cityId("5,1").keyword("Java").pageIndex("1").pageSize("10").language("zh-cn").area("us").timestamp(String.valueOf(System.currentTimeMillis())).build();
        ResponseVo postList = TencentRecruitHttpclient.getPostList(param);
        PostDetailParam detailParam = PostDetailParam.builder().timestamp(String.valueOf(System.currentTimeMillis())).language("zh-cn").postId("1338824547352190976").build();
        ResponseVo detail = TencentRecruitHttpclient.getDetail(detailParam);
    }


    public static ResponseVo getPostList(PostListParam param){
        if(ObjectUtil.isNotNull(param)){
            Map paramMap = JSON.parseObject(JSON.toJSONString(param), Map.class);
            String result = HttpUtil.get(URL_LIST, paramMap);
            ResponseVo responseVo = JSON.parseObject(result, ResponseVo.class);
            return responseVo;
        }else{
            return new ResponseVo();
        }
    }


    public static ResponseVo getDetail(PostDetailParam param){
        if(ObjectUtil.isNotNull(param)){
            Map paramMap = JSON.parseObject(JSON.toJSONString(param), Map.class);
            String result = HttpUtil.get(URL_DETAIL, paramMap);
            ResponseVo responseVo = JSON.parseObject(result, ResponseVo.class);
            return responseVo;
        }else{
            return new ResponseVo();
        }
    }
}
