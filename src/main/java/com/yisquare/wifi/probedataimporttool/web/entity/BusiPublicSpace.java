package com.yisquare.wifi.probedataimporttool.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公共区域信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_PUBLIC_SPACE")
public class BusiPublicSpace implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域主键编号
     */
    @TableId(value = "SPACE_ID", type = IdType.AUTO)
    private Long spaceId;

    /**
     * 区域名称
     */
    @TableField("SPACE_NAME")
    private String spaceName;

    /**
     * 公共区域编号
     */
    @TableField("SPACE_CODE")
    private String spaceCode;

    /**
     * 区域面积（单位：平米）
     */
    @TableField("SPACE_AREA")
    private Integer spaceArea;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 商城主键编号
     */
    @TableField("MARKET_ID")
    private Long marketId;

    /**
     * 有效状态（0-禁用  1-启用）
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 备注说明
     */
    @TableField("REMARKS")
    private String remarks;

    /**
     * 公区类型：0-普通公区  1-中庭
     */
    @TableField("SPACE_TYPE")
    private Integer spaceType;

    @TableField("PIC_URL")
    private String picUrl;


}
