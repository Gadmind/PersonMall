package com.daop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:01:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

