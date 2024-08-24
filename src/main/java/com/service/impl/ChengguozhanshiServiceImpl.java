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


import com.dao.ChengguozhanshiDao;
import com.entity.ChengguozhanshiEntity;
import com.service.ChengguozhanshiService;
import com.entity.vo.ChengguozhanshiVO;
import com.entity.view.ChengguozhanshiView;

@Service("chengguozhanshiService")
public class ChengguozhanshiServiceImpl extends ServiceImpl<ChengguozhanshiDao, ChengguozhanshiEntity> implements ChengguozhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengguozhanshiEntity> page = this.selectPage(
                new Query<ChengguozhanshiEntity>(params).getPage(),
                new EntityWrapper<ChengguozhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengguozhanshiEntity> wrapper) {
		  Page<ChengguozhanshiView> page =new Query<ChengguozhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChengguozhanshiVO> selectListVO(Wrapper<ChengguozhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengguozhanshiVO selectVO(Wrapper<ChengguozhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengguozhanshiView> selectListView(Wrapper<ChengguozhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengguozhanshiView selectView(Wrapper<ChengguozhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
