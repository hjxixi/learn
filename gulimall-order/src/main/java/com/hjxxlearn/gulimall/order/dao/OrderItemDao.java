package com.hjxxlearn.gulimall.order.dao;

import com.hjxxlearn.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 16:51:56
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
