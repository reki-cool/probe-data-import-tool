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
 * 业态信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_RETAIL")
public class BusiRetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "RETAIL_ID", type = IdType.AUTO)
    private Long retailId;

    /**
     * 业态名称
     */
    @TableField("RETAIL_NAME")
    private String retailName;

    /**
     * 业态图片
     */
    @TableField("RETAIL_ICON")
    private String retailIcon;

    /**
     * 父级业态主键编号
     */
    @TableField("FATHER_ID")
    private Long fatherId;

    /**
     * 业态级别（0为最高级别）
     */
    @TableField("RETAIL_LEVEL")
    private Integer retailLevel;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 商场主键编号
     */
    @TableField("MARKET_ID")
    private Long marketId;

    /**
     * 有效状态（0-禁用   1-启用）
     */
    @TableField("STATUS")
    private Integer status;

    @TableField("REMARKS")
    private String remarks;


}
