package com.github.zzhen0v0.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.gulimail.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 17:36:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
