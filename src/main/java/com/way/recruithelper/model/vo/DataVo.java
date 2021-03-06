package com.way.recruithelper.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author wayleung
 * @description
 * @date 2020-12-18 17:47:04
 */
@Data
@NoArgsConstructor
public class DataVo  implements Serializable {

    private static final long serialVersionUID = 1469516696681111192L;
    /**
     * {
     *     "Code": 200,
     *     "Data": {
     *         "Count": 864,
     *         "Posts": [
     *             {
     *                 "Id": 0,
     *                 "PostId": "1334055477889212416",
     *                 "RecruitPostId": 69738,
     *                 "RecruitPostName": "18435-金融科技Java开发高级工程师（深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "负责根据金融业务需求的开发实现，大数据计算开发及性能优化，架构优化。",
     *                 "LastUpdateTime": "2020年12月17日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1334055477889212416",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1297804472256307200",
     *                 "RecruitPostId": 65351,
     *                 "RecruitPostName": "30628-腾讯广告JAVA后台开发工程师 （深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "负责营销中台的分层服务架构设计、任务调度框架设计、数据模型的设计和研发等； \n负责营销中台的后端功能开发，包括API鉴权频控、用户洞察、人群定向等功能。",
     *                 "LastUpdateTime": "2020年12月16日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1297804472256307200",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1337326333964853248",
     *                 "RecruitPostId": 70235,
     *                 "RecruitPostName": "TEG04-Code平台Java高级开发工程师（深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "TEG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1.负责腾讯工蜂源码管理产品的架构设计和技术选型；\n2.负责腾讯工蜂源码管理产品核心模块开发、技术攻坚和性能优化；\n3.参与开发过程的代码设计、审核和规范制定",
     *                 "LastUpdateTime": "2020年12月16日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1337326333964853248",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1338824547352190976",
     *                 "RecruitPostId": 70398,
     *                 "RecruitPostName": "18436-数据平台高级Java工程师（深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1.负责腾讯互联网金融大数据应用类系统的架构设计和开发工作，提供复杂系统的设计支持，推动业务和技术的融合落地；\n2.负责相关技术文档编写工作；\n3.主导技术难点攻关，持续提升系统在海量数据、高并发下的处理性能，解决系统潜在技术风险；",
     *                 "LastUpdateTime": "2020年12月16日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1338824547352190976",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1338824555128430592",
     *                 "RecruitPostId": 70401,
     *                 "RecruitPostName": "18436-高级Java架构师(深圳)",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1、参与数据中台、资金中台开发，撰写技术方案和系统设计，以及相关的代码开发；\n2、接受高并发、海量数据的挑战，分析和发现系统的优化点，负责推动系统的性能和可用性的提升；\n3、为团队引入创新的技术、创新的解决方案，用创新的思路解决问题",
     *                 "LastUpdateTime": "2020年12月15日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=0",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1306127591039574016",
     *                 "RecruitPostId": 66229,
     *                 "RecruitPostName": "18428-金融科技java后端开发高级工程师",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "负责金融科技devops平台的规划设计和开发实现工作，包括大数据日志平台、监控平台、故障智能发现和定位、分布式自动化运维平台、统一运维配置中心等；\n研究并引进业界devops领先技术，深入系统架构性能优化，提高系统的健壮性和可用性。",
     *                 "LastUpdateTime": "2020年12月11日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1306127591039574016",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1260754160320520192",
     *                 "RecruitPostId": 61646,
     *                 "RecruitPostName": "35604-GO/C++/Java后台开发工程师（深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "PCG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "负责NOW直播/腾讯直播业务的后台开发及维护； 负责QQ群视频平台业务的开发和维护； 负责互动直播类相关海量后台的架构设计、实现和维护。",
     *                 "LastUpdateTime": "2020年12月08日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1260754160320520192",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1333305984101130240",
     *                 "RecruitPostId": 69559,
     *                 "RecruitPostName": "41071-腾讯会议Golang/Java高级后台工程师",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CSIG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1、负责产品核心系统的研发工作；\n2、参与制定前后端业务流程、接口协议、文档输出等；\n3、参与项目研发、部署及日常运维工作；",
     *                 "LastUpdateTime": "2020年12月04日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1333305984101130240",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1163726783401431040",
     *                 "RecruitPostId": 52746,
     *                 "RecruitPostName": "18428-金融科技财付通分布式组件研发工程师(JAVA/C++)（深圳）",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "CDG",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1.负责FiT金融线分布式事务组件的架构设计和演进\n2.负责FiT金融线分布式事务组件的开发(linux, C/C++， JAVA)",
     *                 "LastUpdateTime": "2020年12月03日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1163726783401431040",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             },
     *             {
     *                 "Id": 0,
     *                 "PostId": "1333608010601209856",
     *                 "RecruitPostId": 69627,
     *                 "RecruitPostName": "RP-高级Java/go应用开发工程师",
     *                 "CountryName": "中国",
     *                 "LocationName": "深圳",
     *                 "BGName": "S3",
     *                 "ProductName": "",
     *                 "CategoryName": "技术",
     *                 "Responsibility": "1、负责腾讯HR助手云产品系统的开发工作，包括需求分析、系统设计和开发工作\n2、负责腾讯HR助手云产品开发框架的搭建、数据库设计，完成后台逻辑代码的开发和上线以及后期的运营\n3、负责saas、私有云和混合云整体技术架构升级优化，确保在安全，可用性、扩展性和性能等方面的系统整体可用性\n4、对未来云产品技术架构具有前瞻性和规划能力。",
     *                 "LastUpdateTime": "2020年12月02日",
     *                 "PostURL": "http://careers.tencent.com/jobdesc.html?postId=1333608010601209856",
     *                 "SourceID": 1,
     *                 "IsCollect": false,
     *                 "IsValid": true
     *             }
     *         ]
     *     }
     * }
     */

    private Integer Count;
    private List<PostListVo> Posts;
}
