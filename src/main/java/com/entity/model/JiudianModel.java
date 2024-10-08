package com.entity.model;

import com.entity.JiudianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 酒店信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiudianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 酒店名称
     */
    private String jiudianName;


    /**
     * 房间类型
     */
    private Integer jiudianTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 设置：酒店名称
	 */
    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 获取：房间类型
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }


    /**
	 * 设置：房间类型
	 */
    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 获取：价格/天
	 */
    public Double getJiudianMoney() {
        return jiudianMoney;
    }


    /**
	 * 设置：价格/天
	 */
    public void setJiudianMoney(Double jiudianMoney) {
        this.jiudianMoney = jiudianMoney;
    }
    /**
	 * 获取：酒店图片
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }


    /**
	 * 设置：酒店图片
	 */
    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 获取：酒店地址
	 */
    public String getJiudianAddress() {
        return jiudianAddress;
    }


    /**
	 * 设置：酒店地址
	 */
    public void setJiudianAddress(String jiudianAddress) {
        this.jiudianAddress = jiudianAddress;
    }
    /**
	 * 获取：酒店详情
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }


    /**
	 * 设置：酒店详情
	 */
    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
