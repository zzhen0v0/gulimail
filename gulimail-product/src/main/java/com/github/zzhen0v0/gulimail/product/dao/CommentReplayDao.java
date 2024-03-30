package com.github.zzhen0v0.gulimail.product.dao;

import com.github.zzhen0v0.gulimail.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 14:43:57
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}