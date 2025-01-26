package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZengsongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZengsongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZengsongxinxiView;


/**
 * 赠送信息
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface ZengsongxinxiService extends IService<ZengsongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZengsongxinxiVO> selectListVO(Wrapper<ZengsongxinxiEntity> wrapper);
   	
   	ZengsongxinxiVO selectVO(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
   	
   	List<ZengsongxinxiView> selectListView(Wrapper<ZengsongxinxiEntity> wrapper);
   	
   	ZengsongxinxiView selectView(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZengsongxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZengsongxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZengsongxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZengsongxinxiEntity> wrapper);



}

