package com.github.zzhen0v0.gulimail.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.common.utils.Query;

import com.github.zzhen0v0.gulimail.coupon.dao.CouponDao;
import com.github.zzhen0v0.gulimail.coupon.entity.CouponEntity;
import com.github.zzhen0v0.gulimail.coupon.service.CouponService;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements CouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponEntity> page = this.page(
                new Query<CouponEntity>().getPage(params),
                new QueryWrapper<CouponEntity>()
        );

        return new PageUtils(page);
    }

}