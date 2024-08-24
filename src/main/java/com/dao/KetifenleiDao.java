package com.dao;

import com.entity.KetifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetifenleiVO;
import com.entity.view.KetifenleiView;


/**
 * 课题分类
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
public interface KetifenleiDao extends BaseMapper<KetifenleiEntity> {
	
	List<KetifenleiVO> selectListVO(@Param("ew") Wrapper<KetifenleiEntity> wrapper);
	
	KetifenleiVO selectVO(@Param("ew") Wrapper<KetifenleiEntity> wrapper);
	
	List<KetifenleiView> selectListView(@Param("ew") Wrapper<KetifenleiEntity> wrapper);

	List<KetifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KetifenleiEntity> wrapper);

	
	KetifenleiView selectView(@Param("ew") Wrapper<KetifenleiEntity> wrapper);
	

}
