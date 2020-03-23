package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jihu
 * @email springhuge@foxmail.com
 * @date 2020-03-23 09:46:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
