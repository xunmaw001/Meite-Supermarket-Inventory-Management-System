package com.dao;

import com.entity.PandianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PandianxinxiVO;
import com.entity.view.PandianxinxiView;


/**
 * 盘点信息
 * 
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface PandianxinxiDao extends BaseMapper<PandianxinxiEntity> {
	
	List<PandianxinxiVO> selectListVO(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
	
	PandianxinxiVO selectVO(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
	
	List<PandianxinxiView> selectListView(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);

	List<PandianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
	
	PandianxinxiView selectView(@Param("ew") Wrapper<PandianxinxiEntity> wrapper);
	

}
