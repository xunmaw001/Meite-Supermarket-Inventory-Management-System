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


import com.dao.TuihuorukuDao;
import com.entity.TuihuorukuEntity;
import com.service.TuihuorukuService;
import com.entity.vo.TuihuorukuVO;
import com.entity.view.TuihuorukuView;

@Service("tuihuorukuService")
public class TuihuorukuServiceImpl extends ServiceImpl<TuihuorukuDao, TuihuorukuEntity> implements TuihuorukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuorukuEntity> page = this.selectPage(
                new Query<TuihuorukuEntity>(params).getPage(),
                new EntityWrapper<TuihuorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuorukuEntity> wrapper) {
		  Page<TuihuorukuView> page =new Query<TuihuorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuorukuVO> selectListVO(Wrapper<TuihuorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuorukuVO selectVO(Wrapper<TuihuorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuorukuView> selectListView(Wrapper<TuihuorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuorukuView selectView(Wrapper<TuihuorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TuihuorukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TuihuorukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TuihuorukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
