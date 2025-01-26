package com.dao;

import com.entity.ZengpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZengpinrukuVO;
import com.entity.view.ZengpinrukuView;


/**
 * 赠品入库
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface ZengpinrukuDao extends BaseMapper<ZengpinrukuEntity> {
	
	List<ZengpinrukuVO> selectListVO(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
	
	ZengpinrukuVO selectVO(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
	
	List<ZengpinrukuView> selectListView(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);

	List<ZengpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
	
	ZengpinrukuView selectView(@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZengpinrukuEntity> wrapper);



}
