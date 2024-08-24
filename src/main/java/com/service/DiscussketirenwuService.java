package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussketirenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussketirenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussketirenwuView;


/**
 * 课题任务评论表
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface DiscussketirenwuService extends IService<DiscussketirenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussketirenwuVO> selectListVO(Wrapper<DiscussketirenwuEntity> wrapper);
   	
   	DiscussketirenwuVO selectVO(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);
   	
   	List<DiscussketirenwuView> selectListView(Wrapper<DiscussketirenwuEntity> wrapper);
   	
   	DiscussketirenwuView selectView(@Param("ew") Wrapper<DiscussketirenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussketirenwuEntity> wrapper);

   	

}

