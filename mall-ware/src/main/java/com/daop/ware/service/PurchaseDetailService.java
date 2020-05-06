package com.daop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

