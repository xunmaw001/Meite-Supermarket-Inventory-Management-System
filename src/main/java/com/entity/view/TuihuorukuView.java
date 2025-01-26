package com.entity.view;

import com.entity.TuihuorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退货入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("tuihuoruku")
public class TuihuorukuView  extends TuihuorukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuihuorukuView(){
	}
 
 	public TuihuorukuView(TuihuorukuEntity tuihuorukuEntity){
 	try {
			BeanUtils.copyProperties(this, tuihuorukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
