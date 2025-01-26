package com.entity.view;

import com.entity.ZengsongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赠送信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("zengsongxinxi")
public class ZengsongxinxiView  extends ZengsongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZengsongxinxiView(){
	}
 
 	public ZengsongxinxiView(ZengsongxinxiEntity zengsongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zengsongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
