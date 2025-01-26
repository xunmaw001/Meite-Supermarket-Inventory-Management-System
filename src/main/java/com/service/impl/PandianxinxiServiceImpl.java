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


import com.dao.PandianxinxiDao;
import com.entity.PandianxinxiEntity;
import com.service.PandianxinxiService;
import com.entity.vo.PandianxinxiVO;
import com.entity.view.PandianxinxiView;

@Service("pandianxinxiService")
public class PandianxinxiServiceImpl extends ServiceImpl<PandianxinxiDao, PandianxinxiEntity> implements PandianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PandianxinxiEntity> page = this.selectPage(
                new Query<PandianxinxiEntity>(params).getPage(),
                new EntityWrapper<PandianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PandianxinxiEntity> wrapper) {
		  Page<PandianxinxiView> page =new Query<PandianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PandianxinxiVO> selectListVO(Wrapper<PandianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PandianxinxiVO selectVO(Wrapper<PandianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PandianxinxiView> selectListView(Wrapper<PandianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PandianxinxiView selectView(Wrapper<PandianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
