package com.github.zzhen0v0.gulimail.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.common.utils.Query;

import com.github.zzhen0v0.gulimail.coupon.dao.SpuBoundsDao;
import com.github.zzhen0v0.gulimail.coupon.entity.SpuBoundsEntity;
import com.github.zzhen0v0.gulimail.coupon.service.SpuBoundsService;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}