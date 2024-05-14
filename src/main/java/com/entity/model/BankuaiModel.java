package com.entity.model;

import com.entity.BankuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 板块信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BankuaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 板块标题
     */
    private String bankuaiName;


    /**
     * 板块类型
     */
    private Integer bankuaiTypes;


    /**
     * 板块图片
     */
    private String bankuaiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 板块详情
     */
    private String bankuaiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：板块标题
	 */
    public String getBankuaiName() {
        return bankuaiName;
    }


    /**
	 * 设置：板块标题
	 */
    public void setBankuaiName(String bankuaiName) {
        this.bankuaiName = bankuaiName;
    }
    /**
	 * 获取：板块类型
	 */
    public Integer getBankuaiTypes() {
        return bankuaiTypes;
    }


    /**
	 * 设置：板块类型
	 */
    public void setBankuaiTypes(Integer bankuaiTypes) {
        this.bankuaiTypes = bankuaiTypes;
    }
    /**
	 * 获取：板块图片
	 */
    public String getBankuaiPhoto() {
        return bankuaiPhoto;
    }


    /**
	 * 设置：板块图片
	 */
    public void setBankuaiPhoto(String bankuaiPhoto) {
        this.bankuaiPhoto = bankuaiPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：板块详情
	 */
    public String getBankuaiContent() {
        return bankuaiContent;
    }


    /**
	 * 设置：板块详情
	 */
    public void setBankuaiContent(String bankuaiContent) {
        this.bankuaiContent = bankuaiContent;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
