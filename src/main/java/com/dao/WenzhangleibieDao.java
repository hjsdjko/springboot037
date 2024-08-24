package com.dao;

import com.entity.WenzhangleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangleibieVO;
import com.entity.view.WenzhangleibieView;


/**
 * 文章类别
 * 
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
public interface WenzhangleibieDao extends BaseMapper<WenzhangleibieEntity> {
	
	List<WenzhangleibieVO> selectListVO(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);
	
	WenzhangleibieVO selectVO(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);
	
	List<WenzhangleibieView> selectListView(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);

	List<WenzhangleibieView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);

	
	WenzhangleibieView selectView(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);
	

}
