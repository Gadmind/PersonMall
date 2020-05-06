package com.daop.ware.dao;

import com.daop.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
