package com.dao;

import com.entity.ShenqingbiaobiaodanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingbiaobiaodanVO;
import com.entity.view.ShenqingbiaobiaodanView;


/**
 * 申请表表单
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface ShenqingbiaobiaodanDao extends BaseMapper<ShenqingbiaobiaodanEntity> {
	
	List<ShenqingbiaobiaodanVO> selectListVO(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);
	
	ShenqingbiaobiaodanVO selectVO(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);
	
	List<ShenqingbiaobiaodanView> selectListView(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);

	List<ShenqingbiaobiaodanView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);

	
	ShenqingbiaobiaodanView selectView(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);
	

}
