package com.entity.model;

import com.entity.JiudianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 酒店预定 show3
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiudianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 酒店
     */
    private Integer jiudianId;


    /**
     * 预定时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiudianOrderTime;


    /**
     * 预定天数
     */
    private Integer jiudianOrderNumber;


    /**
     * 创建时间
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：酒店
	 */
    public Integer getJiudianId() {
        return jiudianId;
    }


    /**
	 * 设置：酒店
	 */
    public void setJiudianId(Integer jiudianId) {
        this.jiudianId = jiudianId;
    }
    /**
	 * 获取：预定时间
	 */
    public Date getJiudianOrderTime() {
        return jiudianOrderTime;
    }


    /**
	 * 设置：预定时间
	 */
    public void setJiudianOrderTime(Date jiudianOrderTime) {
        this.jiudianOrderTime = jiudianOrderTime;
    }
    /**
	 * 获取：预定天数
	 */
    public Integer getJiudianOrderNumber() {
        return jiudianOrderNumber;
    }


    /**
	 * 设置：预定天数
	 */
    public void setJiudianOrderNumber(Integer jiudianOrderNumber) {
        this.jiudianOrderNumber = jiudianOrderNumber;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
