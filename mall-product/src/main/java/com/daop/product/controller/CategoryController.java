package com.daop.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daop.product.entity.CategoryEntity;
import com.daop.product.service.CategoryService;
import com.daop.common.utils.PageUtils;
import com.daop.common.utils.R;


/**
 * 商品三级分类
 *
 * @author daop
 * @email rootdudaop@gmail.com
 * @date 2020-05-06 20:15:42
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询出所有分类以及子分类，以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    public R list(@RequestParam Map<String, Object> params) {
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);
        return R.ok();
    }

    @RequestMapping("/update/sort")
    public R update(@RequestBody CategoryEntity[] category) {
        categoryService.updateBatchById(Arrays.asList(category));

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * Post请求有请求体
     * SpringMVC自动将请求体的数据（json）转为对应的对象
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeMenuByIds(Arrays.asList(catIds));

        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
