package com.daop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daop.common.utils.PageUtils;
import com.daop.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

