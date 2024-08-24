package com.dao;

import com.entity.DiscusschengguozhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschengguozhanshiVO;
import com.entity.view.DiscusschengguozhanshiView;


/**
 * 成果展示评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:56
 */
public interface DiscusschengguozhanshiDao extends BaseMapper<DiscusschengguozhanshiEntity> {
	
	List<DiscusschengguozhanshiVO> selectListVO(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);
	
	DiscusschengguozhanshiVO selectVO(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);
	
	List<DiscusschengguozhanshiView> selectListView(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);

	List<DiscusschengguozhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);

	
	DiscusschengguozhanshiView selectView(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);
	

}
