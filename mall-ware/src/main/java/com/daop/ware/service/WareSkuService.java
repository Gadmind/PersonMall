package com.daop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

