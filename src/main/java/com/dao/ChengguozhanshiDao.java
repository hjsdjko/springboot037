package com.dao;

import com.entity.ChengguozhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengguozhanshiVO;
import com.entity.view.ChengguozhanshiView;


/**
 * 成果展示
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface ChengguozhanshiDao extends BaseMapper<ChengguozhanshiEntity> {
	
	List<ChengguozhanshiVO> selectListVO(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);
	
	ChengguozhanshiVO selectVO(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);
	
	List<ChengguozhanshiView> selectListView(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);

	List<ChengguozhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);

	
	ChengguozhanshiView selectView(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);
	

}
