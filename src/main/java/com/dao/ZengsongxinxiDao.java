package com.dao;

import com.entity.ZengsongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZengsongxinxiVO;
import com.entity.view.ZengsongxinxiView;


/**
 * 赠送信息
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface ZengsongxinxiDao extends BaseMapper<ZengsongxinxiEntity> {
	
	List<ZengsongxinxiVO> selectListVO(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
	
	ZengsongxinxiVO selectVO(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
	
	List<ZengsongxinxiView> selectListView(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);

	List<ZengsongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
	
	ZengsongxinxiView selectView(@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZengsongxinxiEntity> wrapper);



}
