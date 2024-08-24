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

import com.entity.KetirenwuEntity;
import com.entity.view.KetirenwuView;

import com.service.KetirenwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 课题任务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
@RestController
@RequestMapping("/ketirenwu")
public class KetirenwuController {
    @Autowired
    private KetirenwuService ketirenwuService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KetirenwuEntity ketirenwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			ketirenwu.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KetirenwuEntity> ew = new EntityWrapper<KetirenwuEntity>();

		PageUtils page = ketirenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketirenwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KetirenwuEntity ketirenwu, 
		HttpServletRequest request){
        EntityWrapper<KetirenwuEntity> ew = new EntityWrapper<KetirenwuEntity>();

		PageUtils page = ketirenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ketirenwu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KetirenwuEntity ketirenwu){
       	EntityWrapper<KetirenwuEntity> ew = new EntityWrapper<KetirenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ketirenwu, "ketirenwu")); 
        return R.ok().put("data", ketirenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KetirenwuEntity ketirenwu){
        EntityWrapper< KetirenwuEntity> ew = new EntityWrapper< KetirenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ketirenwu, "ketirenwu")); 
		KetirenwuView ketirenwuView =  ketirenwuService.selectView(ew);
		return R.ok("查询课题任务成功").put("data", ketirenwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KetirenwuEntity ketirenwu = ketirenwuService.selectById(id);
        return R.ok().put("data", ketirenwu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KetirenwuEntity ketirenwu = ketirenwuService.selectById(id);
        return R.ok().put("data", ketirenwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KetirenwuEntity ketirenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ketirenwu);
        ketirenwuService.insert(ketirenwu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KetirenwuEntity ketirenwu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ketirenwu);
        ketirenwuService.insert(ketirenwu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KetirenwuEntity ketirenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ketirenwu);
        ketirenwuService.updateById(ketirenwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ketirenwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
