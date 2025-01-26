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


import com.dao.QitarukuDao;
import com.entity.QitarukuEntity;
import com.service.QitarukuService;
import com.entity.vo.QitarukuVO;
import com.entity.view.QitarukuView;

@Service("qitarukuService")
public class QitarukuServiceImpl extends ServiceImpl<QitarukuDao, QitarukuEntity> implements QitarukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QitarukuEntity> page = this.selectPage(
                new Query<QitarukuEntity>(params).getPage(),
                new EntityWrapper<QitarukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QitarukuEntity> wrapper) {
		  Page<QitarukuView> page =new Query<QitarukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QitarukuVO> selectListVO(Wrapper<QitarukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QitarukuVO selectVO(Wrapper<QitarukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QitarukuView> selectListView(Wrapper<QitarukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QitarukuView selectView(Wrapper<QitarukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QitarukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QitarukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QitarukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
