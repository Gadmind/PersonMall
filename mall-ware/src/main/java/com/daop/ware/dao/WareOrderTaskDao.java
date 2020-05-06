package com.daop.ware.dao;

import com.daop.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
