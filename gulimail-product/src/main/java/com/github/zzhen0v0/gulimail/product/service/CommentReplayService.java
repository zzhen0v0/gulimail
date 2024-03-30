package com.github.zzhen0v0.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.gulimail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 14:43:57
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

