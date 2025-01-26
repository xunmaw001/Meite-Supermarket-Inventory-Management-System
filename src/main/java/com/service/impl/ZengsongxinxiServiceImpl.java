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


import com.dao.ZengsongxinxiDao;
import com.entity.ZengsongxinxiEntity;
import com.service.ZengsongxinxiService;
import com.entity.vo.ZengsongxinxiVO;
import com.entity.view.ZengsongxinxiView;

@Service("zengsongxinxiService")
public class ZengsongxinxiServiceImpl extends ServiceImpl<ZengsongxinxiDao, ZengsongxinxiEntity> implements ZengsongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZengsongxinxiEntity> page = this.selectPage(
                new Query<ZengsongxinxiEntity>(params).getPage(),
                new EntityWrapper<ZengsongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZengsongxinxiEntity> wrapper) {
		  Page<ZengsongxinxiView> page =new Query<ZengsongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZengsongxinxiVO> selectListVO(Wrapper<ZengsongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZengsongxinxiVO selectVO(Wrapper<ZengsongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZengsongxinxiView> selectListView(Wrapper<ZengsongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZengsongxinxiView selectView(Wrapper<ZengsongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZengsongxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZengsongxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZengsongxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
