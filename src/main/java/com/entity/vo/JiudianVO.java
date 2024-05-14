package com.entity.vo;

import com.entity.JiudianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 酒店信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiudian")
public class JiudianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 酒店名称
     */

    @TableField(value = "jiudian_name")
    private String jiudianName;


    /**
     * 房间类型
     */

    @TableField(value = "jiudian_types")
    private Integer jiudianTypes;


    /**
     * 价格/天
     */

    @TableField(value = "jiudian_money")
    private Double jiudianMoney;


    /**
     * 酒店图片
     */

    @TableField(value = "jiudian_photo")
    private String jiudianPhoto;


    /**
     * 酒店地址
     */

    @TableField(value = "jiudian_address")
    private String jiudianAddress;


    /**
     * 酒店详情
     */

    @TableField(value = "jiudian_content")
    private String jiudianContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 获取：酒店名称
	 */

    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 设置：房间类型
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }


    /**
	 * 获取：房间类型
	 */

    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 设置：价格/天
	 */
    public Double getJiudianMoney() {
        return jiudianMoney;
    }


    /**
	 * 获取：价格/天
	 */

    public void setJiudianMoney(Double jiudianMoney) {
        this.jiudianMoney = jiudianMoney;
    }
    /**
	 * 设置：酒店图片
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }


    /**
	 * 获取：酒店图片
	 */

    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 设置：酒店地址
	 */
    public String getJiudianAddress() {
        return jiudianAddress;
    }


    /**
	 * 获取：酒店地址
	 */

    public void setJiudianAddress(String jiudianAddress) {
        this.jiudianAddress = jiudianAddress;
    }
    /**
	 * 设置：酒店详情
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }


    /**
	 * 获取：酒店详情
	 */

    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
