package com.hjxxlearn.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjxxlearn.common.utils.PageUtils;
import com.hjxxlearn.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 14:47:08
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

