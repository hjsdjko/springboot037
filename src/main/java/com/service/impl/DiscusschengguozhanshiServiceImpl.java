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


import com.dao.DiscusschengguozhanshiDao;
import com.entity.DiscusschengguozhanshiEntity;
import com.service.DiscusschengguozhanshiService;
import com.entity.vo.DiscusschengguozhanshiVO;
import com.entity.view.DiscusschengguozhanshiView;

@Service("discusschengguozhanshiService")
public class DiscusschengguozhanshiServiceImpl extends ServiceImpl<DiscusschengguozhanshiDao, DiscusschengguozhanshiEntity> implements DiscusschengguozhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschengguozhanshiEntity> page = this.selectPage(
                new Query<DiscusschengguozhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscusschengguozhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschengguozhanshiEntity> wrapper) {
		  Page<DiscusschengguozhanshiView> page =new Query<DiscusschengguozhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschengguozhanshiVO> selectListVO(Wrapper<DiscusschengguozhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschengguozhanshiVO selectVO(Wrapper<DiscusschengguozhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschengguozhanshiView> selectListView(Wrapper<DiscusschengguozhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschengguozhanshiView selectView(Wrapper<DiscusschengguozhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
