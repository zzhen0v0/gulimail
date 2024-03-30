package com.github.zzhen0v0.gulimail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.zzhen0v0.gulimail.product.entity.BrandEntity;
import com.github.zzhen0v0.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(15L);
        brandEntity.setDescript("华为");
//        brandEntity.setName("乐事");
//        brandService.save(brandEntity);
//        System.out.println("save successfully!");
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(
                new QueryWrapper<BrandEntity>().eq("brand_id", 15L));
        list.forEach(System.out::println);
    }

}
