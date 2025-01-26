package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZengpinrukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZengpinrukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZengpinrukuView;


/**
 * 赠品入库
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface ZengpinrukuService extends IService<ZengpinrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZengpinrukuVO> selectListVO(Wrapper<ZengpinrukuEntity> wrapper);
   	
   	ZengpinrukuVO selectVO(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
   	
   	List<ZengpinrukuView> selectListView(Wrapper<ZengpinrukuEntity> wrapper);
   	
   	ZengpinrukuView selectView(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZengpinrukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZengpinrukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZengpinrukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZengpinrukuEntity> wrapper);



}

