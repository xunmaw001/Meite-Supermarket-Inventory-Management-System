package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigourukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigourukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigourukuView;


/**
 * 采购入库
 *
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public interface CaigourukuService extends IService<CaigourukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigourukuVO> selectListVO(Wrapper<CaigourukuEntity> wrapper);
   	
   	CaigourukuVO selectVO(@Param("ew") Wrapper<CaigourukuEntity> wrapper);
   	
   	List<CaigourukuView> selectListView(Wrapper<CaigourukuEntity> wrapper);
   	
   	CaigourukuView selectView(@Param("ew") Wrapper<CaigourukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigourukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CaigourukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CaigourukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CaigourukuEntity> wrapper);



}

