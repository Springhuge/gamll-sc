package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author jihu
 * @email springhuge@foxmail.com
 * @date 2020-03-22 14:26:43
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

