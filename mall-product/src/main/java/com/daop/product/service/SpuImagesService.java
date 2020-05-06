package com.daop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:41
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

