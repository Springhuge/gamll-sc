package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author jihu
 * @email springhuge@foxmail.com
 * @date 2020-03-23 09:45:12
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
