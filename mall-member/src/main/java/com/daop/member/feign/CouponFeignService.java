package com.daop.member.feign;

import com.daop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: PersonMall
 * @BelongsPackage: com.daop.member.feign
 * @Description: 远程调用Coupon服务
 * @DATE: 2020-05-06 21:48
 * @AUTHOR: Daop
 **/
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/smscoupon/member/list")
    public R memberCoupons();
}
