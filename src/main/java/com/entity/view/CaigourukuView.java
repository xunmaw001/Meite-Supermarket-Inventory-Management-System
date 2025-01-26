package com.entity.view;

import com.entity.CaigourukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采购入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("caigouruku")
public class CaigourukuView  extends CaigourukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaigourukuView(){
	}
 
 	public CaigourukuView(CaigourukuEntity caigourukuEntity){
 	try {
			BeanUtils.copyProperties(this, caigourukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
