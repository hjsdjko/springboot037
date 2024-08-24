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

import com.entity.WenzhangleibieEntity;
import com.entity.view.WenzhangleibieView;

import com.service.WenzhangleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 文章类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
@RestController
@RequestMapping("/wenzhangleibie")
public class WenzhangleibieController {
    @Autowired
    private WenzhangleibieService wenzhangleibieService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhangleibieEntity wenzhangleibie,
		HttpServletRequest request){
        EntityWrapper<WenzhangleibieEntity> ew = new EntityWrapper<WenzhangleibieEntity>();

		PageUtils page = wenzhangleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhangleibieEntity wenzhangleibie, 
		HttpServletRequest request){
        EntityWrapper<WenzhangleibieEntity> ew = new EntityWrapper<WenzhangleibieEntity>();

		PageUtils page = wenzhangleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangleibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhangleibieEntity wenzhangleibie){
       	EntityWrapper<WenzhangleibieEntity> ew = new EntityWrapper<WenzhangleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhangleibie, "wenzhangleibie")); 
        return R.ok().put("data", wenzhangleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhangleibieEntity wenzhangleibie){
        EntityWrapper< WenzhangleibieEntity> ew = new EntityWrapper< WenzhangleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhangleibie, "wenzhangleibie")); 
		WenzhangleibieView wenzhangleibieView =  wenzhangleibieService.selectView(ew);
		return R.ok("查询文章类别成功").put("data", wenzhangleibieView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhangleibieEntity wenzhangleibie = wenzhangleibieService.selectById(id);
        return R.ok().put("data", wenzhangleibie);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhangleibieEntity wenzhangleibie = wenzhangleibieService.selectById(id);
        return R.ok().put("data", wenzhangleibie);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhangleibieEntity wenzhangleibie, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(wenzhangleibie);
        wenzhangleibieService.insert(wenzhangleibie);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhangleibieEntity wenzhangleibie, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(wenzhangleibie);
        wenzhangleibieService.insert(wenzhangleibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhangleibieEntity wenzhangleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhangleibie);
        wenzhangleibieService.updateById(wenzhangleibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhangleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
