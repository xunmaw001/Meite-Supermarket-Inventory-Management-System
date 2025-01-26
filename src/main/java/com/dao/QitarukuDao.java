package com.dao;

import com.entity.QitarukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QitarukuVO;
import com.entity.view.QitarukuView;


/**
 * 其它入库
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface QitarukuDao extends BaseMapper<QitarukuEntity> {
	
	List<QitarukuVO> selectListVO(@Param("ew") Wrapper<QitarukuEntity> wrapper);
	
	QitarukuVO selectVO(@Param("ew") Wrapper<QitarukuEntity> wrapper);
	
	List<QitarukuView> selectListView(@Param("ew") Wrapper<QitarukuEntity> wrapper);

	List<QitarukuView> selectListView(Pagination page,@Param("ew") Wrapper<QitarukuEntity> wrapper);
	
	QitarukuView selectView(@Param("ew") Wrapper<QitarukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<QitarukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QitarukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QitarukuEntity> wrapper);



}
