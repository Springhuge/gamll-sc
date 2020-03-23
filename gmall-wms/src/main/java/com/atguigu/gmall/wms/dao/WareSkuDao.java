package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author jihu
 * @email springhuge@foxmail.com
 * @date 2020-03-23 09:48:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
