package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschengguozhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschengguozhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschengguozhanshiView;


/**
 * 成果展示评论表
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:56
 */
public interface DiscusschengguozhanshiService extends IService<DiscusschengguozhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschengguozhanshiVO> selectListVO(Wrapper<DiscusschengguozhanshiEntity> wrapper);
   	
   	DiscusschengguozhanshiVO selectVO(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);
   	
   	List<DiscusschengguozhanshiView> selectListView(Wrapper<DiscusschengguozhanshiEntity> wrapper);
   	
   	DiscusschengguozhanshiView selectView(@Param("ew") Wrapper<DiscusschengguozhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschengguozhanshiEntity> wrapper);

   	

}

