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

import com.entity.ShenqingbiaobiaodanEntity;
import com.entity.view.ShenqingbiaobiaodanView;

import com.service.ShenqingbiaobiaodanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请表表单
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:55
 */
@RestController
@RequestMapping("/shenqingbiaobiaodan")
public class ShenqingbiaobiaodanController {
    @Autowired
    private ShenqingbiaobiaodanService shenqingbiaobiaodanService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingbiaobiaodanEntity shenqingbiaobiaodan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenqingbiaobiaodan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingbiaobiaodanEntity> ew = new EntityWrapper<ShenqingbiaobiaodanEntity>();

		PageUtils page = shenqingbiaobiaodanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingbiaobiaodan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingbiaobiaodanEntity shenqingbiaobiaodan, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenqingbiaobiaodan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingbiaobiaodanEntity> ew = new EntityWrapper<ShenqingbiaobiaodanEntity>();

		PageUtils page = shenqingbiaobiaodanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingbiaobiaodan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingbiaobiaodanEntity shenqingbiaobiaodan){
       	EntityWrapper<ShenqingbiaobiaodanEntity> ew = new EntityWrapper<ShenqingbiaobiaodanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingbiaobiaodan, "shenqingbiaobiaodan")); 
        return R.ok().put("data", shenqingbiaobiaodanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingbiaobiaodanEntity shenqingbiaobiaodan){
        EntityWrapper< ShenqingbiaobiaodanEntity> ew = new EntityWrapper< ShenqingbiaobiaodanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingbiaobiaodan, "shenqingbiaobiaodan")); 
		ShenqingbiaobiaodanView shenqingbiaobiaodanView =  shenqingbiaobiaodanService.selectView(ew);
		return R.ok("查询申请表表单成功").put("data", shenqingbiaobiaodanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingbiaobiaodanEntity shenqingbiaobiaodan = shenqingbiaobiaodanService.selectById(id);
        return R.ok().put("data", shenqingbiaobiaodan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingbiaobiaodanEntity shenqingbiaobiaodan = shenqingbiaobiaodanService.selectById(id);
        return R.ok().put("data", shenqingbiaobiaodan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingbiaobiaodanEntity shenqingbiaobiaodan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenqingbiaobiaodan);
        shenqingbiaobiaodanService.insert(shenqingbiaobiaodan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingbiaobiaodanEntity shenqingbiaobiaodan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenqingbiaobiaodan);
    	shenqingbiaobiaodan.setUserid((Long)request.getSession().getAttribute("userId"));
        shenqingbiaobiaodanService.insert(shenqingbiaobiaodan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingbiaobiaodanEntity shenqingbiaobiaodan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingbiaobiaodan);
        shenqingbiaobiaodanService.updateById(shenqingbiaobiaodan);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShenqingbiaobiaodanEntity> list = new ArrayList<ShenqingbiaobiaodanEntity>();
        for(Long id : ids) {
            ShenqingbiaobiaodanEntity shenqingbiaobiaodan = shenqingbiaobiaodanService.selectById(id);
            shenqingbiaobiaodan.setSfsh(sfsh);
            shenqingbiaobiaodan.setShhf(shhf);
            list.add(shenqingbiaobiaodan);
        }
        shenqingbiaobiaodanService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingbiaobiaodanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
