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
 * 成果展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
@TableName("chengguozhanshi")
public class ChengguozhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengguozhanshiEntity() {
		
	}
	
	public ChengguozhanshiEntity(T t) {
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
	 * 成果名称
	 */
					
	private String chengguomingcheng;
	
	/**
	 * 成果照片
	 */
					
	private String chengguozhaopian;
	
	/**
	 * 成果附件
	 */
					
	private String chengguofujian;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 成果简介
	 */
					
	private String chengguojianjie;
	
	/**
	 * 成果详情
	 */
					
	private String chengguoxiangqing;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
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
	 * 设置：成果名称
	 */
	public void setChengguomingcheng(String chengguomingcheng) {
		this.chengguomingcheng = chengguomingcheng;
	}
	/**
	 * 获取：成果名称
	 */
	public String getChengguomingcheng() {
		return chengguomingcheng;
	}
	/**
	 * 设置：成果照片
	 */
	public void setChengguozhaopian(String chengguozhaopian) {
		this.chengguozhaopian = chengguozhaopian;
	}
	/**
	 * 获取：成果照片
	 */
	public String getChengguozhaopian() {
		return chengguozhaopian;
	}
	/**
	 * 设置：成果附件
	 */
	public void setChengguofujian(String chengguofujian) {
		this.chengguofujian = chengguofujian;
	}
	/**
	 * 获取：成果附件
	 */
	public String getChengguofujian() {
		return chengguofujian;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：成果简介
	 */
	public void setChengguojianjie(String chengguojianjie) {
		this.chengguojianjie = chengguojianjie;
	}
	/**
	 * 获取：成果简介
	 */
	public String getChengguojianjie() {
		return chengguojianjie;
	}
	/**
	 * 设置：成果详情
	 */
	public void setChengguoxiangqing(String chengguoxiangqing) {
		this.chengguoxiangqing = chengguoxiangqing;
	}
	/**
	 * 获取：成果详情
	 */
	public String getChengguoxiangqing() {
		return chengguoxiangqing;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
