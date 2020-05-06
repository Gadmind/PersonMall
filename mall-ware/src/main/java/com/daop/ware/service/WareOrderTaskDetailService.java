package com.daop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

