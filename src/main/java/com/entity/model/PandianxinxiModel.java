package com.entity.model;

import com.entity.PandianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 盘点信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
public class PandianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 盘点数量
	 */
	
	private String pandianshuliang;
		
	/**
	 * 盘点备注
	 */
	
	private String pandianbeizhu;
		
	/**
	 * 盘点日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pandianriqi;
				
	
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
	 * 设置：盘点数量
	 */
	 
	public void setPandianshuliang(String pandianshuliang) {
		this.pandianshuliang = pandianshuliang;
	}
	
	/**
	 * 获取：盘点数量
	 */
	public String getPandianshuliang() {
		return pandianshuliang;
	}
				
	
	/**
	 * 设置：盘点备注
	 */
	 
	public void setPandianbeizhu(String pandianbeizhu) {
		this.pandianbeizhu = pandianbeizhu;
	}
	
	/**
	 * 获取：盘点备注
	 */
	public String getPandianbeizhu() {
		return pandianbeizhu;
	}
				
	
	/**
	 * 设置：盘点日期
	 */
	 
	public void setPandianriqi(Date pandianriqi) {
		this.pandianriqi = pandianriqi;
	}
	
	/**
	 * 获取：盘点日期
	 */
	public Date getPandianriqi() {
		return pandianriqi;
	}
			
}
