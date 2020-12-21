package com.way.recruithelper.model.param;

import com.way.recruithelper.model.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 15:02:01
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class PostDetailParam {
    /**
     * timestamp:1608272286930
     * postId:1338824547352190976
     * language:zh-cn
     */
    private String timestamp = String.valueOf(System.currentTimeMillis());
    private String postId;
    private String language = Constant.LANGUAGE;
}
