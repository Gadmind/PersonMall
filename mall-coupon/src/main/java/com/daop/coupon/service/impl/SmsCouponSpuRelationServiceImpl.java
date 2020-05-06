package com.daop.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.daop.common.utils.PageUtils;
import com.daop.common.utils.Query;

import com.daop.coupon.dao.SmsCouponSpuRelationDao;
import com.daop.coupon.entity.SmsCouponSpuRelationEntity;
import com.daop.coupon.service.SmsCouponSpuRelationService;


@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelationEntity> implements SmsCouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuRelationEntity> page = this.page(
                new Query<SmsCouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuRelationEntity>()
        );

        return new PageUtils(page);
    }

}