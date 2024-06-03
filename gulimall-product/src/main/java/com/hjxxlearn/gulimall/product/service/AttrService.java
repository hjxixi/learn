package com.hjxxlearn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjxxlearn.common.utils.PageUtils;
import com.hjxxlearn.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 09:37:33
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

