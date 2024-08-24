package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KetifenleiEntity;
import com.entity.view.KetifenleiView;

import com.service.KetifenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 课题分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
@RestController
@RequestMapping("/ketifenlei")
public class KetifenleiController {
    @Autowired
    private KetifenleiService ketifenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KetifenleiEntity ketifenlei,
		HttpServletRequest request){
        EntityWrapper<KetifenleiEntity> ew = new EntityWrapper<KetifenleiEntity>();

		PageUtils page = ketifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketifenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KetifenleiEntity ketifenlei, 
		HttpServletRequest request){
        EntityWrapper<KetifenleiEntity> ew = new EntityWrapper<KetifenleiEntity>();

		PageUtils page = ketifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketifenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KetifenleiEntity ketifenlei){
       	EntityWrapper<KetifenleiEntity> ew = new EntityWrapper<KetifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ketifenlei, "ketifenlei")); 
        return R.ok().put("data", ketifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KetifenleiEntity ketifenlei){
        EntityWrapper< KetifenleiEntity> ew = new EntityWrapper< KetifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ketifenlei, "ketifenlei")); 
		KetifenleiView ketifenleiView =  ketifenleiService.selectView(ew);
		return R.ok("查询课题分类成功").put("data", ketifenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KetifenleiEntity ketifenlei = ketifenleiService.selectById(id);
        return R.ok().put("data", ketifenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KetifenleiEntity ketifenlei = ketifenleiService.selectById(id);
        return R.ok().put("data", ketifenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KetifenleiEntity ketifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ketifenlei);
        ketifenleiService.insert(ketifenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KetifenleiEntity ketifenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ketifenlei);
        ketifenleiService.insert(ketifenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KetifenleiEntity ketifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ketifenlei);
        ketifenleiService.updateById(ketifenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ketifenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
