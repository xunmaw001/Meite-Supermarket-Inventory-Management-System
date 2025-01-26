package com.entity.model;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-24 13:47:58
 */
public class ShangpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 售价
	 */
	
	private Float shoujia;
		
	/**
	 * 商品折扣
	 */
	
	private Float shangpinzhekou;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 商品位置
	 */
	
	private String shangpinweizhi;
		
	/**
	 * 商品备注
	 */
	
	private String shangpinbeizhu;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
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
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：售价
	 */
	 
	public void setShoujia(Float shoujia) {
		this.shoujia = shoujia;
	}
	
	/**
	 * 获取：售价
	 */
	public Float getShoujia() {
		return shoujia;
	}
				
	
	/**
	 * 设置：商品折扣
	 */
	 
	public void setShangpinzhekou(Float shangpinzhekou) {
		this.shangpinzhekou = shangpinzhekou;
	}
	
	/**
	 * 获取：商品折扣
	 */
	public Float getShangpinzhekou() {
		return shangpinzhekou;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：商品位置
	 */
	 
	public void setShangpinweizhi(String shangpinweizhi) {
		this.shangpinweizhi = shangpinweizhi;
	}
	
	/**
	 * 获取：商品位置
	 */
	public String getShangpinweizhi() {
		return shangpinweizhi;
	}
				
	
	/**
	 * 设置：商品备注
	 */
	 
	public void setShangpinbeizhu(String shangpinbeizhu) {
		this.shangpinbeizhu = shangpinbeizhu;
	}
	
	/**
	 * 获取：商品备注
	 */
	public String getShangpinbeizhu() {
		return shangpinbeizhu;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
