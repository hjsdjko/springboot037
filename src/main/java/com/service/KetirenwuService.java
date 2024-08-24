package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetirenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetirenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetirenwuView;


/**
 * 课题任务
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface KetirenwuService extends IService<KetirenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetirenwuVO> selectListVO(Wrapper<KetirenwuEntity> wrapper);
   	
   	KetirenwuVO selectVO(@Param("ew") Wrapper<KetirenwuEntity> wrapper);
   	
   	List<KetirenwuView> selectListView(Wrapper<KetirenwuEntity> wrapper);
   	
   	KetirenwuView selectView(@Param("ew") Wrapper<KetirenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetirenwuEntity> wrapper);

   	

}

