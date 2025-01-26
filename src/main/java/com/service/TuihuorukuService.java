package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuihuorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuihuorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuorukuView;


/**
 * 退货入库
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface TuihuorukuService extends IService<TuihuorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuorukuVO> selectListVO(Wrapper<TuihuorukuEntity> wrapper);
   	
   	TuihuorukuVO selectVO(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
   	
   	List<TuihuorukuView> selectListView(Wrapper<TuihuorukuEntity> wrapper);
   	
   	TuihuorukuView selectView(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuorukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TuihuorukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TuihuorukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TuihuorukuEntity> wrapper);



}

