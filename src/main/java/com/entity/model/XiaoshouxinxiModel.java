package com.entity.model;

import com.entity.XiaoshouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public class XiaoshouxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 销售数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 销售单价
	 */
	
	private Float xiaoshoudanjia;
		
	/**
	 * 销售金额
	 */
	
	private Float xiaoshoujine;
		
	/**
	 * 客户
	 */
	
	private String kehu;
		
	/**
	 * 销售日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaoshouriqi;
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：销售数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：销售数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：销售单价
	 */
	 
	public void setXiaoshoudanjia(Float xiaoshoudanjia) {
		this.xiaoshoudanjia = xiaoshoudanjia;
	}
	
	/**
	 * 获取：销售单价
	 */
	public Float getXiaoshoudanjia() {
		return xiaoshoudanjia;
	}
				
	
	/**
	 * 设置：销售金额
	 */
	 
	public void setXiaoshoujine(Float xiaoshoujine) {
		this.xiaoshoujine = xiaoshoujine;
	}
	
	/**
	 * 获取：销售金额
	 */
	public Float getXiaoshoujine() {
		return xiaoshoujine;
	}
				
	
	/**
	 * 设置：客户
	 */
	 
	public void setKehu(String kehu) {
		this.kehu = kehu;
	}
	
	/**
	 * 获取：客户
	 */
	public String getKehu() {
		return kehu;
	}
				
	
	/**
	 * 设置：销售日期
	 */
	 
	public void setXiaoshouriqi(Date xiaoshouriqi) {
		this.xiaoshouriqi = xiaoshouriqi;
	}
	
	/**
	 * 获取：销售日期
	 */
	public Date getXiaoshouriqi() {
		return xiaoshouriqi;
	}
			
}
