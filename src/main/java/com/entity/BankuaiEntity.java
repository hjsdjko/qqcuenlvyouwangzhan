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
 * 板块信息
 *
 * @author 
 * @email
 */
@TableName("bankuai")
public class BankuaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BankuaiEntity() {

	}

	public BankuaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 板块标题
     */
    @TableField(value = "bankuai_name")

    private String bankuaiName;


    /**
     * 板块类型
     */
    @TableField(value = "bankuai_types")

    private Integer bankuaiTypes;


    /**
     * 板块图片
     */
    @TableField(value = "bankuai_photo")

    private String bankuaiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 板块详情
     */
    @TableField(value = "bankuai_content")

    private String bankuaiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：板块标题
	 */
    public String getBankuaiName() {
        return bankuaiName;
    }


    /**
	 * 获取：板块标题
	 */

    public void setBankuaiName(String bankuaiName) {
        this.bankuaiName = bankuaiName;
    }
    /**
	 * 设置：板块类型
	 */
    public Integer getBankuaiTypes() {
        return bankuaiTypes;
    }


    /**
	 * 获取：板块类型
	 */

    public void setBankuaiTypes(Integer bankuaiTypes) {
        this.bankuaiTypes = bankuaiTypes;
    }
    /**
	 * 设置：板块图片
	 */
    public String getBankuaiPhoto() {
        return bankuaiPhoto;
    }


    /**
	 * 获取：板块图片
	 */

    public void setBankuaiPhoto(String bankuaiPhoto) {
        this.bankuaiPhoto = bankuaiPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：板块详情
	 */
    public String getBankuaiContent() {
        return bankuaiContent;
    }


    /**
	 * 获取：板块详情
	 */

    public void setBankuaiContent(String bankuaiContent) {
        this.bankuaiContent = bankuaiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Bankuai{" +
            "id=" + id +
            ", bankuaiName=" + bankuaiName +
            ", bankuaiTypes=" + bankuaiTypes +
            ", bankuaiPhoto=" + bankuaiPhoto +
            ", insertTime=" + insertTime +
            ", bankuaiContent=" + bankuaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
