package com.daop.member.dao;

import com.daop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:52:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
