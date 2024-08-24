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

import com.entity.ChengguozhanshiEntity;
import com.entity.view.ChengguozhanshiView;

import com.service.ChengguozhanshiService;
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
 * 成果展示
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
@RestController
@RequestMapping("/chengguozhanshi")
public class ChengguozhanshiController {
    @Autowired
    private ChengguozhanshiService chengguozhanshiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChengguozhanshiEntity chengguozhanshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chengguozhanshi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChengguozhanshiEntity> ew = new EntityWrapper<ChengguozhanshiEntity>();

		PageUtils page = chengguozhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengguozhanshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChengguozhanshiEntity chengguozhanshi, 
		HttpServletRequest request){
        EntityWrapper<ChengguozhanshiEntity> ew = new EntityWrapper<ChengguozhanshiEntity>();

		PageUtils page = chengguozhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chengguozhanshi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChengguozhanshiEntity chengguozhanshi){
       	EntityWrapper<ChengguozhanshiEntity> ew = new EntityWrapper<ChengguozhanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chengguozhanshi, "chengguozhanshi")); 
        return R.ok().put("data", chengguozhanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChengguozhanshiEntity chengguozhanshi){
        EntityWrapper< ChengguozhanshiEntity> ew = new EntityWrapper< ChengguozhanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chengguozhanshi, "chengguozhanshi")); 
		ChengguozhanshiView chengguozhanshiView =  chengguozhanshiService.selectView(ew);
		return R.ok("查询成果展示成功").put("data", chengguozhanshiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChengguozhanshiEntity chengguozhanshi = chengguozhanshiService.selectById(id);
        return R.ok().put("data", chengguozhanshi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChengguozhanshiEntity chengguozhanshi = chengguozhanshiService.selectById(id);
        return R.ok().put("data", chengguozhanshi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChengguozhanshiEntity chengguozhanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chengguozhanshi);
        chengguozhanshiService.insert(chengguozhanshi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChengguozhanshiEntity chengguozhanshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chengguozhanshi);
        chengguozhanshiService.insert(chengguozhanshi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChengguozhanshiEntity chengguozhanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chengguozhanshi);
        chengguozhanshiService.updateById(chengguozhanshi);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ChengguozhanshiEntity> list = new ArrayList<ChengguozhanshiEntity>();
        for(Long id : ids) {
            ChengguozhanshiEntity chengguozhanshi = chengguozhanshiService.selectById(id);
            chengguozhanshi.setSfsh(sfsh);
            chengguozhanshi.setShhf(shhf);
            list.add(chengguozhanshi);
        }
        chengguozhanshiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chengguozhanshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
