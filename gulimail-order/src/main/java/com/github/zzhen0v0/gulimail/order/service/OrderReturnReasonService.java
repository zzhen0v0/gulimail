package com.github.zzhen0v0.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.gulimail.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 17:36:02
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

