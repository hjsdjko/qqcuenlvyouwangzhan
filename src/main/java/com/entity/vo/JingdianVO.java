package com.entity.vo;

import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅游景点
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingdian")
public class JingdianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 景点编号
     */

    @TableField(value = "jingdian_uuid_number")
    private String jingdianUuidNumber;


    /**
     * 景点名称
     */

    @TableField(value = "jingdian_name")
    private String jingdianName;


    /**
     * 景点类型
     */

    @TableField(value = "jingdian_types")
    private Integer jingdianTypes;


    /**
     * 景点图片
     */

    @TableField(value = "jingdian_photo")
    private String jingdianPhoto;


    /**
     * 开放时间
     */

    @TableField(value = "jingdian_kiafangshijian")
    private String jingdianKiafangshijian;


    /**
     * 旅游景点详情
     */

    @TableField(value = "jingdian_content")
    private String jingdianContent;


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
	 * 设置：景点编号
	 */
    public String getJingdianUuidNumber() {
        return jingdianUuidNumber;
    }


    /**
	 * 获取：景点编号
	 */

    public void setJingdianUuidNumber(String jingdianUuidNumber) {
        this.jingdianUuidNumber = jingdianUuidNumber;
    }
    /**
	 * 设置：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名称
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点图片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点图片
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：开放时间
	 */
    public String getJingdianKiafangshijian() {
        return jingdianKiafangshijian;
    }


    /**
	 * 获取：开放时间
	 */

    public void setJingdianKiafangshijian(String jingdianKiafangshijian) {
        this.jingdianKiafangshijian = jingdianKiafangshijian;
    }
    /**
	 * 设置：旅游景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：旅游景点详情
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
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
