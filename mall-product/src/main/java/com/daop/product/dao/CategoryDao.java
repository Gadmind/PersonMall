package com.daop.product.dao;

import com.daop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
