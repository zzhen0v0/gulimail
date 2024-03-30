package com.github.zzhen0v0.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.gulimail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author zzhen0v0
 * @email zzhen0v0@gmail.com
 * @date 2024-03-30 17:25:12
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

