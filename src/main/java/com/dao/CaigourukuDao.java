package com.dao;

import com.entity.CaigourukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigourukuVO;
import com.entity.view.CaigourukuView;


/**
 * 采购入库
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface CaigourukuDao extends BaseMapper<CaigourukuEntity> {
	
	List<CaigourukuVO> selectListVO(@Param("ew") Wrapper<CaigourukuEntity> wrapper);
	
	CaigourukuVO selectVO(@Param("ew") Wrapper<CaigourukuEntity> wrapper);
	
	List<CaigourukuView> selectListView(@Param("ew") Wrapper<CaigourukuEntity> wrapper);

	List<CaigourukuView> selectListView(Pagination page,@Param("ew") Wrapper<CaigourukuEntity> wrapper);
	
	CaigourukuView selectView(@Param("ew") Wrapper<CaigourukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<CaigourukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigourukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigourukuEntity> wrapper);



}
