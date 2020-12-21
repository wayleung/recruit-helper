package com.way.recruithelper.tencent.model.vo;

import java.io.Serializable;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 15:00:26
 */
public class PostDetailVo  implements Serializable {
    private static final long serialVersionUID = -9163332389462039668L;
    /**
     * PostId : 1338824547352190976
     * RecruitPostId : 70398
     * RecruitPostName : 18436-数据平台高级Java工程师（深圳）
     * LocationId : 1
     * LocationName : 深圳
     * BGId : 953
     * BGName : CDG
     * OuterPostTypeID : 40001001
     * CategoryName : 技术
     * ProductName :
     * Responsibility : 1.负责腾讯互联网金融大数据应用类系统的架构设计和开发工作，提供复杂系统的设计支持，推动业务和技术的融合落地；
     2.负责相关技术文档编写工作；
     3.主导技术难点攻关，持续提升系统在海量数据、高并发下的处理性能，解决系统潜在技术风险；
     * Requirement : 岗位要求：
     1.5年以上工作经验，精通java技术，熟悉JVM、缓存、消息队列等；
     2.熟悉面向对象和设计模式，熟悉主流开源应用框架，如Spring、MyBatis、springmvc、Maven、git等开发技术及工具；
     3.熟悉分布式、多线程、高并发及高可用、设计、编码和调优；熟悉常用的网络通信协议原理
     4.有大数据方面工作经验如hadoop、storm、spark、hbase等技术的优先；
     5.熟悉前端开发js、html、css、jquery、vuejs等技术
     6.良好的学习能力、团队协作能力和沟通能力
     * LastUpdateTime : 2020年12月16日
     * PostURL : http://careers.tencent.com/jobdesc.html?postId=1338824547352190976
     * SourceID : 1
     * IsCollect : false
     */

    private String PostId;
    private Integer RecruitPostId;
    private String RecruitPostName;
    private Integer LocationId;
    private String LocationName;
    private Integer BGId;
    private String BGName;
    private String OuterPostTypeID;
    private String CategoryName;
    private String ProductName;
    private String Responsibility;
    private String Requirement;
    private String LastUpdateTime;
    private String PostURL;
    private Integer SourceID;
    private Boolean IsCollect;
}
