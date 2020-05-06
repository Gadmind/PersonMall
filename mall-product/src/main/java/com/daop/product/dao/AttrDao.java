package com.daop.product.dao;

import com.daop.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:42
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
