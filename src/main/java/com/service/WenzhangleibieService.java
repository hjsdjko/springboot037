package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangleibieView;


/**
 * 文章类别
 *
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
public interface WenzhangleibieService extends IService<WenzhangleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangleibieVO> selectListVO(Wrapper<WenzhangleibieEntity> wrapper);
   	
   	WenzhangleibieVO selectVO(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);
   	
   	List<WenzhangleibieView> selectListView(Wrapper<WenzhangleibieEntity> wrapper);
   	
   	WenzhangleibieView selectView(@Param("ew") Wrapper<WenzhangleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangleibieEntity> wrapper);

   	

}

