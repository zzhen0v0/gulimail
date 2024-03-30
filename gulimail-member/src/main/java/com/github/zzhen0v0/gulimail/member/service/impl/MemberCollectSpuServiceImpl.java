package com.github.zzhen0v0.gulimail.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zzhen0v0.common.utils.PageUtils;
import com.github.zzhen0v0.common.utils.Query;

import com.github.zzhen0v0.gulimail.member.dao.MemberCollectSpuDao;
import com.github.zzhen0v0.gulimail.member.entity.MemberCollectSpuEntity;
import com.github.zzhen0v0.gulimail.member.service.MemberCollectSpuService;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSpuEntity> page = this.page(
                new Query<MemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<MemberCollectSpuEntity>()
        );

        return new PageUtils(page);
    }

}