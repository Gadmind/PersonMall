package com.daop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.coupon.entity.SmsSeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:42:20
 */
public interface SmsSeckillSessionService extends IService<SmsSeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

