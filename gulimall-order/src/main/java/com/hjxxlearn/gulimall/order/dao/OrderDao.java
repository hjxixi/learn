package com.hjxxlearn.gulimall.order.dao;

import com.hjxxlearn.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 16:51:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
