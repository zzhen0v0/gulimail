package com.github.zzhen0v0.gulimail.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.common.utils.Query;

import com.github.zzhen0v0.gulimail.order.dao.OrderItemDao;
import com.github.zzhen0v0.gulimail.order.entity.OrderItemEntity;
import com.github.zzhen0v0.gulimail.order.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

}