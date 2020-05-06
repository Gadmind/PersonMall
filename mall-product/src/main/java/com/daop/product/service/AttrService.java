package com.daop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:42
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

