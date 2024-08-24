package com.entity.view;

import com.entity.DiscusschengguozhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 成果展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-14 12:54:56
 */
@TableName("discusschengguozhanshi")
public class DiscusschengguozhanshiView  extends DiscusschengguozhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschengguozhanshiView(){
	}
 
 	public DiscusschengguozhanshiView(DiscusschengguozhanshiEntity discusschengguozhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discusschengguozhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
