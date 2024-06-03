package com.hjxxlearn.gulimall.coupon.dao;

import com.hjxxlearn.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author hjxx
 * @email 1332530191@qq.com
 * @date 2024-05-31 14:47:08
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
