package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaigourukuDao;
import com.entity.CaigourukuEntity;
import com.service.CaigourukuService;
import com.entity.vo.CaigourukuVO;
import com.entity.view.CaigourukuView;

@Service("caigourukuService")
public class CaigourukuServiceImpl extends ServiceImpl<CaigourukuDao, CaigourukuEntity> implements CaigourukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigourukuEntity> page = this.selectPage(
                new Query<CaigourukuEntity>(params).getPage(),
                new EntityWrapper<CaigourukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigourukuEntity> wrapper) {
		  Page<CaigourukuView> page =new Query<CaigourukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigourukuVO> selectListVO(Wrapper<CaigourukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigourukuVO selectVO(Wrapper<CaigourukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigourukuView> selectListView(Wrapper<CaigourukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigourukuView selectView(Wrapper<CaigourukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CaigourukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CaigourukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CaigourukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
