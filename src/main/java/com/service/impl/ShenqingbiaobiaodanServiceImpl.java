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


import com.dao.ShenqingbiaobiaodanDao;
import com.entity.ShenqingbiaobiaodanEntity;
import com.service.ShenqingbiaobiaodanService;
import com.entity.vo.ShenqingbiaobiaodanVO;
import com.entity.view.ShenqingbiaobiaodanView;

@Service("shenqingbiaobiaodanService")
public class ShenqingbiaobiaodanServiceImpl extends ServiceImpl<ShenqingbiaobiaodanDao, ShenqingbiaobiaodanEntity> implements ShenqingbiaobiaodanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingbiaobiaodanEntity> page = this.selectPage(
                new Query<ShenqingbiaobiaodanEntity>(params).getPage(),
                new EntityWrapper<ShenqingbiaobiaodanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingbiaobiaodanEntity> wrapper) {
		  Page<ShenqingbiaobiaodanView> page =new Query<ShenqingbiaobiaodanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShenqingbiaobiaodanVO> selectListVO(Wrapper<ShenqingbiaobiaodanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingbiaobiaodanVO selectVO(Wrapper<ShenqingbiaobiaodanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingbiaobiaodanView> selectListView(Wrapper<ShenqingbiaobiaodanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingbiaobiaodanView selectView(Wrapper<ShenqingbiaobiaodanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
