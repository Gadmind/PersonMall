package com.daop.ware.dao;

import com.daop.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
