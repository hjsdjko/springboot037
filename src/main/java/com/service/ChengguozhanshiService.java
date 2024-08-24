package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengguozhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengguozhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengguozhanshiView;


/**
 * 成果展示
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface ChengguozhanshiService extends IService<ChengguozhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengguozhanshiVO> selectListVO(Wrapper<ChengguozhanshiEntity> wrapper);
   	
   	ChengguozhanshiVO selectVO(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);
   	
   	List<ChengguozhanshiView> selectListView(Wrapper<ChengguozhanshiEntity> wrapper);
   	
   	ChengguozhanshiView selectView(@Param("ew") Wrapper<ChengguozhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengguozhanshiEntity> wrapper);

   	

}

