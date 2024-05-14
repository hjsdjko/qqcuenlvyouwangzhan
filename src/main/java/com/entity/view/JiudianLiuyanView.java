package com.entity.view;

import com.entity.JiudianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 酒店留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiudian_liuyan")
public class JiudianLiuyanView extends JiudianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jiudian
			/**
			* 酒店名称
			*/
			private String jiudianName;
			/**
			* 房间类型
			*/
			private Integer jiudianTypes;
				/**
				* 房间类型的值
				*/
				private String jiudianValue;
			/**
			* 价格/天
			*/
			private Double jiudianMoney;
			/**
			* 酒店图片
			*/
			private String jiudianPhoto;
			/**
			* 酒店地址
			*/
			private String jiudianAddress;
			/**
			* 酒店详情
			*/
			private String jiudianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiudianLiuyanView() {

	}

	public JiudianLiuyanView(JiudianLiuyanEntity jiudianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jiudianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set jiudian
					/**
					* 获取： 酒店名称
					*/
					public String getJiudianName() {
						return jiudianName;
					}
					/**
					* 设置： 酒店名称
					*/
					public void setJiudianName(String jiudianName) {
						this.jiudianName = jiudianName;
					}
					/**
					* 获取： 房间类型
					*/
					public Integer getJiudianTypes() {
						return jiudianTypes;
					}
					/**
					* 设置： 房间类型
					*/
					public void setJiudianTypes(Integer jiudianTypes) {
						this.jiudianTypes = jiudianTypes;
					}


						/**
						* 获取： 房间类型的值
						*/
						public String getJiudianValue() {
							return jiudianValue;
						}
						/**
						* 设置： 房间类型的值
						*/
						public void setJiudianValue(String jiudianValue) {
							this.jiudianValue = jiudianValue;
						}
					/**
					* 获取： 价格/天
					*/
					public Double getJiudianMoney() {
						return jiudianMoney;
					}
					/**
					* 设置： 价格/天
					*/
					public void setJiudianMoney(Double jiudianMoney) {
						this.jiudianMoney = jiudianMoney;
					}
					/**
					* 获取： 酒店图片
					*/
					public String getJiudianPhoto() {
						return jiudianPhoto;
					}
					/**
					* 设置： 酒店图片
					*/
					public void setJiudianPhoto(String jiudianPhoto) {
						this.jiudianPhoto = jiudianPhoto;
					}
					/**
					* 获取： 酒店地址
					*/
					public String getJiudianAddress() {
						return jiudianAddress;
					}
					/**
					* 设置： 酒店地址
					*/
					public void setJiudianAddress(String jiudianAddress) {
						this.jiudianAddress = jiudianAddress;
					}
					/**
					* 获取： 酒店详情
					*/
					public String getJiudianContent() {
						return jiudianContent;
					}
					/**
					* 设置： 酒店详情
					*/
					public void setJiudianContent(String jiudianContent) {
						this.jiudianContent = jiudianContent;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
