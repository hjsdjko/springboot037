package com.entity.view;

import com.entity.WenzhangleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 文章类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
@TableName("wenzhangleibie")
public class WenzhangleibieView  extends WenzhangleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangleibieView(){
	}
 
 	public WenzhangleibieView(WenzhangleibieEntity wenzhangleibieEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
