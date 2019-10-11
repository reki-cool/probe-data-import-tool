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
 * 大楼信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_BUILDING")
public class BusiBuilding implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "BUILD_ID", type = IdType.AUTO)
    private Long buildId;

    /**
     * 类型（1-地上  0-地下）
     */
    @TableField("BUILD_TYPE")
    private Integer buildType;

    /**
     * 大楼名称
     */
    @TableField("BUILD_NAME")
    private String buildName;

    /**
     * 大楼面积（单位：平米）
     */
    @TableField("BUILD_AREA")
    private Integer buildArea;

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
     * 有效状态（0-禁用   1-启用）
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 备注说明
     */
    @TableField("REMARKS")
    private String remarks;


}
