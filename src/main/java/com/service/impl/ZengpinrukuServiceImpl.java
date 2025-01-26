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


import com.dao.ZengpinrukuDao;
import com.entity.ZengpinrukuEntity;
import com.service.ZengpinrukuService;
import com.entity.vo.ZengpinrukuVO;
import com.entity.view.ZengpinrukuView;

@Service("zengpinrukuService")
public class ZengpinrukuServiceImpl extends ServiceImpl<ZengpinrukuDao, ZengpinrukuEntity> implements ZengpinrukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZengpinrukuEntity> page = this.selectPage(
                new Query<ZengpinrukuEntity>(params).getPage(),
                new EntityWrapper<ZengpinrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZengpinrukuEntity> wrapper) {
		  Page<ZengpinrukuView> page =new Query<ZengpinrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZengpinrukuVO> selectListVO(Wrapper<ZengpinrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZengpinrukuVO selectVO(Wrapper<ZengpinrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZengpinrukuView> selectListView(Wrapper<ZengpinrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZengpinrukuView selectView(Wrapper<ZengpinrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZengpinrukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZengpinrukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZengpinrukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
