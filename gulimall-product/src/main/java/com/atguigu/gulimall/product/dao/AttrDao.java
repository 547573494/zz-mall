package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zz
 * @email zz@gmail.com
 * @date 2022-09-27 10:28:22
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
