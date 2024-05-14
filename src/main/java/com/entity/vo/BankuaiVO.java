package com.entity.vo;

import com.entity.BankuaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 板块信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("bankuai")
public class BankuaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 板块详情
     */

    @TableField(value = "bankuai_content")
    private String bankuaiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
