package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zz
 * @email zz@gmail.com
 * @date 2022-09-27 14:43:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
