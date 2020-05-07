package com.daop.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daop.coupon.entity.SmsCouponEntity;
import com.daop.coupon.service.SmsCouponService;
import com.daop.common.utils.PageUtils;
import com.daop.common.utils.R;


/**
 * 优惠券信息
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:42:21
 */
@RefreshScope
@RestController
@RequestMapping("coupon/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;
    @Value("${nacos.user.name}")
    private String name;
    @Value("${nacos.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }

    @RequestMapping("/member/list")
    public R memberCoupons() {
        SmsCouponEntity couponEntity = new SmsCouponEntity();
        couponEntity.setCouponName("满100减50");
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("coupon:smscoupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//   @RequiresPermissions("coupon:smscoupon:info")
    public R info(@PathVariable("id") Long id) {
        SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("coupon:smscoupon:save")
    public R save(@RequestBody SmsCouponEntity smsCoupon) {
        smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("coupon:smscoupon:update")
    public R update(@RequestBody SmsCouponEntity smsCoupon) {
        smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("coupon:smscoupon:delete")
    public R delete(@RequestBody Long[] ids) {
        smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
