package com.dao;

import com.entity.DiscussketirenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussketirenwuVO;
import com.entity.view.DiscussketirenwuView;


/**
 * 课题任务评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface DiscussketirenwuDao extends BaseMapper<DiscussketirenwuEntity> {
	
	List<DiscussketirenwuVO> selectListVO(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);
	
	DiscussketirenwuVO selectVO(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);
	
	List<DiscussketirenwuView> selectListView(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);

	List<DiscussketirenwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);

	
	DiscussketirenwuView selectView(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);
	

}
