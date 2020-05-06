package com.daop.ware.dao;

import com.daop.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 21:07:46
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
