package com.entity.vo;

import com.entity.ZengsongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 赠送信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public class ZengsongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 赠送数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 客户
	 */
	
	private String kehu;
		
	/**
	 * 赠送备注
	 */
	
	private String zengsongbeizhu;
		
	/**
	 * 赠送日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zengsongriqi;
				
	
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
	 * 设置：赠送数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：赠送数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：赠送备注
	 */
	 
	public void setZengsongbeizhu(String zengsongbeizhu) {
		this.zengsongbeizhu = zengsongbeizhu;
	}
	
	/**
	 * 获取：赠送备注
	 */
	public String getZengsongbeizhu() {
		return zengsongbeizhu;
	}
				
	
	/**
	 * 设置：赠送日期
	 */
	 
	public void setZengsongriqi(Date zengsongriqi) {
		this.zengsongriqi = zengsongriqi;
	}
	
	/**
	 * 获取：赠送日期
	 */
	public Date getZengsongriqi() {
		return zengsongriqi;
	}
			
}
