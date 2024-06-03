package com.hjxxlearn.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjxxlearn.common.utils.PageUtils;
import com.hjxxlearn.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 16:51:56
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

