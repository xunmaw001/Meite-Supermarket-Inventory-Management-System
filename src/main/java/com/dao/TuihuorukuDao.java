package com.dao;

import com.entity.TuihuorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuihuorukuVO;
import com.entity.view.TuihuorukuView;


/**
 * 退货入库
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface TuihuorukuDao extends BaseMapper<TuihuorukuEntity> {
	
	List<TuihuorukuVO> selectListVO(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
	
	TuihuorukuVO selectVO(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
	
	List<TuihuorukuView> selectListView(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);

	List<TuihuorukuView> selectListView(Pagination page,@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
	
	TuihuorukuView selectView(@Param("ew") Wrapper<TuihuorukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<TuihuorukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TuihuorukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TuihuorukuEntity> wrapper);



}
