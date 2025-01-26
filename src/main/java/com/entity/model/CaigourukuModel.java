package com.entity.model;

import com.entity.CaigourukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 采购入库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public class CaigourukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 采购数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 采购单价
	 */
	
	private Float caigoudanjia;
		
	/**
	 * 采购金额
	 */
	
	private Float caigoujine;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 采购备注
	 */
	
	private String caigoubeizhu;
		
	/**
	 * 采购日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigouriqi;
				
	
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
	 * 设置：采购数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：采购数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：采购单价
	 */
	 
	public void setCaigoudanjia(Float caigoudanjia) {
		this.caigoudanjia = caigoudanjia;
	}
	
	/**
	 * 获取：采购单价
	 */
	public Float getCaigoudanjia() {
		return caigoudanjia;
	}
				
	
	/**
	 * 设置：采购金额
	 */
	 
	public void setCaigoujine(Float caigoujine) {
		this.caigoujine = caigoujine;
	}
	
	/**
	 * 获取：采购金额
	 */
	public Float getCaigoujine() {
		return caigoujine;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：采购备注
	 */
	 
	public void setCaigoubeizhu(String caigoubeizhu) {
		this.caigoubeizhu = caigoubeizhu;
	}
	
	/**
	 * 获取：采购备注
	 */
	public String getCaigoubeizhu() {
		return caigoubeizhu;
	}
				
	
	/**
	 * 设置：采购日期
	 */
	 
	public void setCaigouriqi(Date caigouriqi) {
		this.caigouriqi = caigouriqi;
	}
	
	/**
	 * 获取：采购日期
	 */
	public Date getCaigouriqi() {
		return caigouriqi;
	}
			
}
