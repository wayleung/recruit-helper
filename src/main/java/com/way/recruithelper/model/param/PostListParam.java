package com.way.recruithelper.model.param;

import com.way.recruithelper.model.constant.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 15:06:56
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class PostListParam {
    /**
     * timestamp:1608270964733
     * countryId:
     * cityId:5,1
     * bgIds:
     * productId:
     * categoryId:
     * parentCategoryId:
     * attrId:
     * keyword:Java
     * pageIndex:1
     * pageSize:10
     * language:zh-cn
     * area:us
     */
    private String timestamp = String.valueOf(System.currentTimeMillis());
    private String countryId;
    private String cityId;
    private String bgIds;
    private String productId;
    private String categoryId;
    private String parentCategoryId;
    private String attrId;
    private String keyword;
    private String pageIndex = "1";
    private String pageSize = "10";
    private String language = Constant.LANGUAGE;
    private String area = Constant.ARE;
}
