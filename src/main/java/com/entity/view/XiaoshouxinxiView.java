package com.entity.view;

import com.entity.XiaoshouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("xiaoshouxinxi")
public class XiaoshouxinxiView  extends XiaoshouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshouxinxiView(){
	}
 
 	public XiaoshouxinxiView(XiaoshouxinxiEntity xiaoshouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
