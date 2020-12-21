package com.way.recruithelper.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class PostListVo  implements Serializable {
        private static final long serialVersionUID = -4881225273989182722L;
        /**
         * Id : 0
         * PostId : 1334055477889212416
         * RecruitPostId : 69738
         * RecruitPostName : 18435-金融科技Java开发高级工程师（深圳）
         * CountryName : 中国
         * LocationName : 深圳
         * BGName : CDG
         * ProductName :
         * CategoryName : 技术
         * Responsibility : 负责根据金融业务需求的开发实现，大数据计算开发及性能优化，架构优化。
         * LastUpdateTime : 2020年12月17日
         * PostURL : http://careers.tencent.com/jobdesc.html?postId=1334055477889212416
         * SourceID : 1
         * IsCollect : false
         * IsValid : true
         */

        private Integer Id;
        private String PostId;
        private Integer RecruitPostId;
        private String RecruitPostName;
        private String CountryName;
        private String LocationName;
        private String BGName;
        private String ProductName;
        private String CategoryName;
        private String Responsibility;
        private String LastUpdateTime;
        private String PostURL;
        private Integer SourceID;
        private Boolean IsCollect;
        private Boolean IsValid;
}