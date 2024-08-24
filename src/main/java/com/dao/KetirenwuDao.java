package com.dao;

import com.entity.KetirenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetirenwuVO;
import com.entity.view.KetirenwuView;


/**
 * 课题任务
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface KetirenwuDao extends BaseMapper<KetirenwuEntity> {
	
	List<KetirenwuVO> selectListVO(@Param("ew") Wrapper<KetirenwuEntity> wrapper);
	
	KetirenwuVO selectVO(@Param("ew") Wrapper<KetirenwuEntity> wrapper);
	
	List<KetirenwuView> selectListView(@Param("ew") Wrapper<KetirenwuEntity> wrapper);

	List<KetirenwuView> selectListView(Pagination page,@Param("ew") Wrapper<KetirenwuEntity> wrapper);

	
	KetirenwuView selectView(@Param("ew") Wrapper<KetirenwuEntity> wrapper);
	

}
