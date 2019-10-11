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
 * 店铺信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_SHOP")
public class BusiShop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "SHOP_ID", type = IdType.AUTO)
    private Long shopId;

    /**
     * 店铺编号
     */
    @TableField("SHOP_CODE")
    private String shopCode;

    /**
     * 店铺名称
     */
    @TableField("SHOP_NAME")
    private String shopName;

    /**
     * 店铺面积（单位：平米）
     */
    @TableField("SHOP_AREA")
    private Integer shopArea;

    /**
     * 业态编号
     */
    @TableField("RETAIL_ID")
    private Long retailId;

    /**
     * 联系电话
     */
    @TableField("MOBILE")
    private String mobile;

    /**
     * 店铺图片
     */
    @TableField("SHOP_ICON")
    private String shopIcon;

    /**
     * 店铺类型(0-普通 1-主力 2-扶持...)
     */
    @TableField("SHOP_TYPE")
    private Integer shopType;

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
     * 驻留量判断(单位：秒)  
     */
    @TableField("MIN_STAY_TIME_LONG")
    private Integer minStayTimeLong;

    /**
     * 店铺是否跨楼层（1-是  0-否  默认0）
     */
    @TableField("MULTI_FLOOR")
    private Integer multiFloor;

    /**
     * 有效状态（0-禁用 1- 启用）
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 备注说明
     */
    @TableField("REMARKS")
    private String remarks;


}
