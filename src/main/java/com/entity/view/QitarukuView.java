package com.entity.view;

import com.entity.QitarukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 其它入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("qitaruku")
public class QitarukuView  extends QitarukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QitarukuView(){
	}
 
 	public QitarukuView(QitarukuEntity qitarukuEntity){
 	try {
			BeanUtils.copyProperties(this, qitarukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
