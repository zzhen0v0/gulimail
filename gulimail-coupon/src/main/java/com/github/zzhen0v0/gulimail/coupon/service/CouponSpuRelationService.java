package com.github.zzhen0v0.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.gulimail.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 17:14:44
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

