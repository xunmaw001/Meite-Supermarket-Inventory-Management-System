package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QitarukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QitarukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QitarukuView;


/**
 * 其它入库
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface QitarukuService extends IService<QitarukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QitarukuVO> selectListVO(Wrapper<QitarukuEntity> wrapper);
   	
   	QitarukuVO selectVO(@Param("ew") Wrapper<QitarukuEntity> wrapper);
   	
   	List<QitarukuView> selectListView(Wrapper<QitarukuEntity> wrapper);
   	
   	QitarukuView selectView(@Param("ew") Wrapper<QitarukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QitarukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QitarukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QitarukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QitarukuEntity> wrapper);



}

