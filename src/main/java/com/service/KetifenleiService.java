package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetifenleiView;


/**
 * 课题分类
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
public interface KetifenleiService extends IService<KetifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetifenleiVO> selectListVO(Wrapper<KetifenleiEntity> wrapper);
   	
   	KetifenleiVO selectVO(@Param("ew") Wrapper<KetifenleiEntity> wrapper);
   	
   	List<KetifenleiView> selectListView(Wrapper<KetifenleiEntity> wrapper);
   	
   	KetifenleiView selectView(@Param("ew") Wrapper<KetifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetifenleiEntity> wrapper);

   	

}

