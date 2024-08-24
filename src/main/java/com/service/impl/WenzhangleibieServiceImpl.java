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


import com.dao.WenzhangleibieDao;
import com.entity.WenzhangleibieEntity;
import com.service.WenzhangleibieService;
import com.entity.vo.WenzhangleibieVO;
import com.entity.view.WenzhangleibieView;

@Service("wenzhangleibieService")
public class WenzhangleibieServiceImpl extends ServiceImpl<WenzhangleibieDao, WenzhangleibieEntity> implements WenzhangleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangleibieEntity> page = this.selectPage(
                new Query<WenzhangleibieEntity>(params).getPage(),
                new EntityWrapper<WenzhangleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangleibieEntity> wrapper) {
		  Page<WenzhangleibieView> page =new Query<WenzhangleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WenzhangleibieVO> selectListVO(Wrapper<WenzhangleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangleibieVO selectVO(Wrapper<WenzhangleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangleibieView> selectListView(Wrapper<WenzhangleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangleibieView selectView(Wrapper<WenzhangleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
