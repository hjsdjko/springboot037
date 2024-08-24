package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课题任务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
@TableName("ketirenwu")
public class KetirenwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KetirenwuEntity() {
		
	}
	
	public KetirenwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 课题名称
	 */
					
	private String ketimingcheng;
	
	/**
	 * 课题分类
	 */
					
	private String ketifenlei;
	
	/**
	 * 课题照片
	 */
					
	private String ketizhaopian;
	
	/**
	 * 课题任务
	 */
					
	private String ketirenwu;
	
	/**
	 * 课题要点
	 */
					
	private String ketiyaodian;
	
	/**
	 * 课题简介
	 */
					
	private String ketijianjie;
	
	/**
	 * 课题详情
	 */
					
	private String ketixiangqing;
	
	/**
	 * 教师账号
	 */
					
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课题名称
	 */
	public void setKetimingcheng(String ketimingcheng) {
		this.ketimingcheng = ketimingcheng;
	}
	/**
	 * 获取：课题名称
	 */
	public String getKetimingcheng() {
		return ketimingcheng;
	}
	/**
	 * 设置：课题分类
	 */
	public void setKetifenlei(String ketifenlei) {
		this.ketifenlei = ketifenlei;
	}
	/**
	 * 获取：课题分类
	 */
	public String getKetifenlei() {
		return ketifenlei;
	}
	/**
	 * 设置：课题照片
	 */
	public void setKetizhaopian(String ketizhaopian) {
		this.ketizhaopian = ketizhaopian;
	}
	/**
	 * 获取：课题照片
	 */
	public String getKetizhaopian() {
		return ketizhaopian;
	}
	/**
	 * 设置：课题任务
	 */
	public void setKetirenwu(String ketirenwu) {
		this.ketirenwu = ketirenwu;
	}
	/**
	 * 获取：课题任务
	 */
	public String getKetirenwu() {
		return ketirenwu;
	}
	/**
	 * 设置：课题要点
	 */
	public void setKetiyaodian(String ketiyaodian) {
		this.ketiyaodian = ketiyaodian;
	}
	/**
	 * 获取：课题要点
	 */
	public String getKetiyaodian() {
		return ketiyaodian;
	}
	/**
	 * 设置：课题简介
	 */
	public void setKetijianjie(String ketijianjie) {
		this.ketijianjie = ketijianjie;
	}
	/**
	 * 获取：课题简介
	 */
	public String getKetijianjie() {
		return ketijianjie;
	}
	/**
	 * 设置：课题详情
	 */
	public void setKetixiangqing(String ketixiangqing) {
		this.ketixiangqing = ketixiangqing;
	}
	/**
	 * 获取：课题详情
	 */
	public String getKetixiangqing() {
		return ketixiangqing;
	}
	/**
	 * 设置：教师账号
	 */
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
