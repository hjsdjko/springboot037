package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussketirenwuDao;
import com.entity.DiscussketirenwuEntity;
import com.service.DiscussketirenwuService;
import com.entity.vo.DiscussketirenwuVO;
import com.entity.view.DiscussketirenwuView;

@Service("discussketirenwuService")
public class DiscussketirenwuServiceImpl extends ServiceImpl<DiscussketirenwuDao, DiscussketirenwuEntity> implements DiscussketirenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussketirenwuEntity> page = this.selectPage(
                new Query<DiscussketirenwuEntity>(params).getPage(),
                new EntityWrapper<DiscussketirenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussketirenwuEntity> wrapper) {
		  Page<DiscussketirenwuView> page =new Query<DiscussketirenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussketirenwuVO> selectListVO(Wrapper<DiscussketirenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussketirenwuVO selectVO(Wrapper<DiscussketirenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussketirenwuView> selectListView(Wrapper<DiscussketirenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussketirenwuView selectView(Wrapper<DiscussketirenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
