package com.entity.view;

import com.entity.LvyouluxianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 旅游路线留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lvyouluxian_liuyan")
public class LvyouluxianLiuyanView extends LvyouluxianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 lvyouluxian
			/**
			* 路线编号
			*/
			private String lvyouluxianUuidNumber;
			/**
			* 路线标题
			*/
			private String lvyouluxianName;
			/**
			* 路线类型
			*/
			private Integer lvyouluxianTypes;
				/**
				* 路线类型的值
				*/
				private String lvyouluxianValue;
			/**
			* 路线预算
			*/
			private Double lvyouluxianMoney;
			/**
			* 路线图片
			*/
			private String lvyouluxianPhoto;
			/**
			* 路线详情
			*/
			private String lvyouluxianContent;

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

	public LvyouluxianLiuyanView() {

	}

	public LvyouluxianLiuyanView(LvyouluxianLiuyanEntity lvyouluxianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, lvyouluxianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set lvyouluxian
					/**
					* 获取： 路线编号
					*/
					public String getLvyouluxianUuidNumber() {
						return lvyouluxianUuidNumber;
					}
					/**
					* 设置： 路线编号
					*/
					public void setLvyouluxianUuidNumber(String lvyouluxianUuidNumber) {
						this.lvyouluxianUuidNumber = lvyouluxianUuidNumber;
					}
					/**
					* 获取： 路线标题
					*/
					public String getLvyouluxianName() {
						return lvyouluxianName;
					}
					/**
					* 设置： 路线标题
					*/
					public void setLvyouluxianName(String lvyouluxianName) {
						this.lvyouluxianName = lvyouluxianName;
					}
					/**
					* 获取： 路线类型
					*/
					public Integer getLvyouluxianTypes() {
						return lvyouluxianTypes;
					}
					/**
					* 设置： 路线类型
					*/
					public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
						this.lvyouluxianTypes = lvyouluxianTypes;
					}


						/**
						* 获取： 路线类型的值
						*/
						public String getLvyouluxianValue() {
							return lvyouluxianValue;
						}
						/**
						* 设置： 路线类型的值
						*/
						public void setLvyouluxianValue(String lvyouluxianValue) {
							this.lvyouluxianValue = lvyouluxianValue;
						}
					/**
					* 获取： 路线预算
					*/
					public Double getLvyouluxianMoney() {
						return lvyouluxianMoney;
					}
					/**
					* 设置： 路线预算
					*/
					public void setLvyouluxianMoney(Double lvyouluxianMoney) {
						this.lvyouluxianMoney = lvyouluxianMoney;
					}
					/**
					* 获取： 路线图片
					*/
					public String getLvyouluxianPhoto() {
						return lvyouluxianPhoto;
					}
					/**
					* 设置： 路线图片
					*/
					public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
						this.lvyouluxianPhoto = lvyouluxianPhoto;
					}
					/**
					* 获取： 路线详情
					*/
					public String getLvyouluxianContent() {
						return lvyouluxianContent;
					}
					/**
					* 设置： 路线详情
					*/
					public void setLvyouluxianContent(String lvyouluxianContent) {
						this.lvyouluxianContent = lvyouluxianContent;
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
