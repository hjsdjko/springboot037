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

import com.entity.WenzhangxinxiEntity;
import com.entity.view.WenzhangxinxiView;

import com.service.WenzhangxinxiService;
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
 * 文章信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-14 12:54:54
 */
@RestController
@RequestMapping("/wenzhangxinxi")
public class WenzhangxinxiController {
    @Autowired
    private WenzhangxinxiService wenzhangxinxiService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhangxinxiEntity wenzhangxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wenzhangxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenzhangxinxiEntity> ew = new EntityWrapper<WenzhangxinxiEntity>();

		PageUtils page = wenzhangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhangxinxiEntity wenzhangxinxi, 
		HttpServletRequest request){
        EntityWrapper<WenzhangxinxiEntity> ew = new EntityWrapper<WenzhangxinxiEntity>();

		PageUtils page = wenzhangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhangxinxiEntity wenzhangxinxi){
       	EntityWrapper<WenzhangxinxiEntity> ew = new EntityWrapper<WenzhangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhangxinxi, "wenzhangxinxi")); 
        return R.ok().put("data", wenzhangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhangxinxiEntity wenzhangxinxi){
        EntityWrapper< WenzhangxinxiEntity> ew = new EntityWrapper< WenzhangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhangxinxi, "wenzhangxinxi")); 
		WenzhangxinxiView wenzhangxinxiView =  wenzhangxinxiService.selectView(ew);
		return R.ok("查询文章信息成功").put("data", wenzhangxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhangxinxiEntity wenzhangxinxi = wenzhangxinxiService.selectById(id);
		wenzhangxinxi.setClicknum(wenzhangxinxi.getClicknum()+1);
		wenzhangxinxi.setClicktime(new Date());
		wenzhangxinxiService.updateById(wenzhangxinxi);
        wenzhangxinxi = wenzhangxinxiService.selectView(new EntityWrapper<WenzhangxinxiEntity>().eq("id", id));
        return R.ok().put("data", wenzhangxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhangxinxiEntity wenzhangxinxi = wenzhangxinxiService.selectById(id);
		wenzhangxinxi.setClicknum(wenzhangxinxi.getClicknum()+1);
		wenzhangxinxi.setClicktime(new Date());
		wenzhangxinxiService.updateById(wenzhangxinxi);
        wenzhangxinxi = wenzhangxinxiService.selectView(new EntityWrapper<WenzhangxinxiEntity>().eq("id", id));
        return R.ok().put("data", wenzhangxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhangxinxiEntity wenzhangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(wenzhangxinxi);
        wenzhangxinxiService.insert(wenzhangxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhangxinxiEntity wenzhangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(wenzhangxinxi);
        wenzhangxinxiService.insert(wenzhangxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhangxinxiEntity wenzhangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhangxinxi);
        wenzhangxinxiService.updateById(wenzhangxinxi);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<WenzhangxinxiEntity> list = new ArrayList<WenzhangxinxiEntity>();
        for(Long id : ids) {
            WenzhangxinxiEntity wenzhangxinxi = wenzhangxinxiService.selectById(id);
            wenzhangxinxi.setSfsh(sfsh);
            wenzhangxinxi.setShhf(shhf);
            list.add(wenzhangxinxi);
        }
        wenzhangxinxiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,WenzhangxinxiEntity wenzhangxinxi, HttpServletRequest request,String pre){
        EntityWrapper<WenzhangxinxiEntity> ew = new EntityWrapper<WenzhangxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = wenzhangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhangxinxi), params), params));
        return R.ok().put("data", page);
    }










}
