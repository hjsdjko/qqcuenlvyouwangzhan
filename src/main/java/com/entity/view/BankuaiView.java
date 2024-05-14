package com.entity.view;

import com.entity.BankuaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 板块信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("bankuai")
public class BankuaiView extends BankuaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 板块类型的值
		*/
		private String bankuaiValue;



	public BankuaiView() {

	}

	public BankuaiView(BankuaiEntity bankuaiEntity) {
		try {
			BeanUtils.copyProperties(this, bankuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 板块类型的值
			*/
			public String getBankuaiValue() {
				return bankuaiValue;
			}
			/**
			* 设置： 板块类型的值
			*/
			public void setBankuaiValue(String bankuaiValue) {
				this.bankuaiValue = bankuaiValue;
			}















}
