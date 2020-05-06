package com.daop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:41
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

