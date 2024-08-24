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


import com.dao.KetirenwuDao;
import com.entity.KetirenwuEntity;
import com.service.KetirenwuService;
import com.entity.vo.KetirenwuVO;
import com.entity.view.KetirenwuView;

@Service("ketirenwuService")
public class KetirenwuServiceImpl extends ServiceImpl<KetirenwuDao, KetirenwuEntity> implements KetirenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetirenwuEntity> page = this.selectPage(
                new Query<KetirenwuEntity>(params).getPage(),
                new EntityWrapper<KetirenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetirenwuEntity> wrapper) {
		  Page<KetirenwuView> page =new Query<KetirenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<KetirenwuVO> selectListVO(Wrapper<KetirenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetirenwuVO selectVO(Wrapper<KetirenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetirenwuView> selectListView(Wrapper<KetirenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetirenwuView selectView(Wrapper<KetirenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
