package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberCollectSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author jihu
 * @email springhuge@foxmail.com
 * @date 2020-03-23 09:46:57
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

