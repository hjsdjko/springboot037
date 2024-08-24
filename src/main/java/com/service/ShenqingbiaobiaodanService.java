package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingbiaobiaodanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingbiaobiaodanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingbiaobiaodanView;


/**
 * 申请表表单
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
public interface ShenqingbiaobiaodanService extends IService<ShenqingbiaobiaodanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingbiaobiaodanVO> selectListVO(Wrapper<ShenqingbiaobiaodanEntity> wrapper);
   	
   	ShenqingbiaobiaodanVO selectVO(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);
   	
   	List<ShenqingbiaobiaodanView> selectListView(Wrapper<ShenqingbiaobiaodanEntity> wrapper);
   	
   	ShenqingbiaobiaodanView selectView(@Param("ew") Wrapper<ShenqingbiaobiaodanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingbiaobiaodanEntity> wrapper);

   	

}

