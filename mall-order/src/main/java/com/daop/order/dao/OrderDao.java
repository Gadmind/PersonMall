package com.daop.order.dao;

import com.daop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:01:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
