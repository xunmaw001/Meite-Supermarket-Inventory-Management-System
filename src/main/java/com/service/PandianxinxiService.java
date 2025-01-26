package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PandianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PandianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PandianxinxiView;


/**
 * 盘点信息
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface PandianxinxiService extends IService<PandianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PandianxinxiVO> selectListVO(Wrapper<PandianxinxiEntity> wrapper);
   	
   	PandianxinxiVO selectVO(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
   	
   	List<PandianxinxiView> selectListView(Wrapper<PandianxinxiEntity> wrapper);
   	
   	PandianxinxiView selectView(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PandianxinxiEntity> wrapper);
   	

}

