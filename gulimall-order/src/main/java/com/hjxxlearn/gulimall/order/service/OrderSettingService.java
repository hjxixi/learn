package com.hjxxlearn.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjxxlearn.common.utils.PageUtils;
import com.hjxxlearn.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 16:51:56
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

