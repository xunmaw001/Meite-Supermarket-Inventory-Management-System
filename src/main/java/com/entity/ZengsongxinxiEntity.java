package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 赠送信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-24 13:47:59
 */
@TableName("zengsongxinxi")
public class ZengsongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZengsongxinxiEntity() {
		
	}
	
	public ZengsongxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zengsongriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
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
