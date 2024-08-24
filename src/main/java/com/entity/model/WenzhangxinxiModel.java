package com.entity.model;

import com.entity.WenzhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 文章信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
public class WenzhangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章标题
	 */
	
	private String wenzhangbiaoti;
		
	/**
	 * 文章类别
	 */
	
	private String wenzhangleibie;
		
	/**
	 * 文章照片
	 */
	
	private String wenzhangzhaopian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 文章简介
	 */
	
	private String wenzhangjianjie;
		
	/**
	 * 文章详情
	 */
	
	private String wenzhangxiangqing;
		
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
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：文章标题
	 */
	 
	public void setWenzhangbiaoti(String wenzhangbiaoti) {
		this.wenzhangbiaoti = wenzhangbiaoti;
	}
	
	/**
	 * 获取：文章标题
	 */
	public String getWenzhangbiaoti() {
		return wenzhangbiaoti;
	}
				
	
	/**
	 * 设置：文章类别
	 */
	 
	public void setWenzhangleibie(String wenzhangleibie) {
		this.wenzhangleibie = wenzhangleibie;
	}
	
	/**
	 * 获取：文章类别
	 */
	public String getWenzhangleibie() {
		return wenzhangleibie;
	}
				
	
	/**
	 * 设置：文章照片
	 */
	 
	public void setWenzhangzhaopian(String wenzhangzhaopian) {
		this.wenzhangzhaopian = wenzhangzhaopian;
	}
	
	/**
	 * 获取：文章照片
	 */
	public String getWenzhangzhaopian() {
		return wenzhangzhaopian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：文章简介
	 */
	 
	public void setWenzhangjianjie(String wenzhangjianjie) {
		this.wenzhangjianjie = wenzhangjianjie;
	}
	
	/**
	 * 获取：文章简介
	 */
	public String getWenzhangjianjie() {
		return wenzhangjianjie;
	}
				
	
	/**
	 * 设置：文章详情
	 */
	 
	public void setWenzhangxiangqing(String wenzhangxiangqing) {
		this.wenzhangxiangqing = wenzhangxiangqing;
	}
	
	/**
	 * 获取：文章详情
	 */
	public String getWenzhangxiangqing() {
		return wenzhangxiangqing;
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
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
