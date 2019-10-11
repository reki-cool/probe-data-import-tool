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
 * 探针信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_AP")
public class BusiAp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "AP_ID", type = IdType.AUTO)
    private Long apId;

    /**
     * 探针编号
     */
    @TableField("AP_CODE")
    private String apCode;

    /**
     * 探针名称
     */
    @TableField("AP_NAME")
    private String apName;

    /**
     * 探针mac地址
     */
    @TableField("AP_MAC")
    private String apMac;

    /**
     * 探针类型（1-店铺 2-公共区域 3-停车场 4-场外）
     */
    @TableField("AP_TYPE")
    private Integer apType;

    /**
     * 探针信号强度范围
     */
    @TableField("RSSI")
    private Integer rssi;

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
     * 楼层主键编号
     */
    @TableField("FLOOR_ID")
    private Long floorId;

    /**
     * 区域ID（店铺ID|公区ID|停车场ID|场外ID）
     */
    @TableField("AREA_ID")
    private Long areaId;

    @TableField("BERTH_ID")
    private Long berthId;

    /**
     * 有效状态(0-禁用   1-启用)
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * Ap软件版本
     */
    @TableField("SOFT_VERSION")
    private String softVersion;

    /**
     * Ap型号
     */
    @TableField("AP_MODEL")
    private String apModel;

    /**
     * 在线状态:0-未上线 1-连接中 2-上线 -1-离线 
     */
    @TableField("ONLINE_STATUS")
    private Integer onlineStatus;

    /**
     * 备注说明
     */
    @TableField("REMARKS")
    private String remarks;

    /**
     * 探针在楼层平台图中X轴位置
     */
    @TableField("AP_X")
    private Integer apX;

    /**
     * 探针在楼层平台图中Y轴位置
     */
    @TableField("AP_Y")
    private Integer apY;

    /**
     * 探针辐射半径
     */
    @TableField("AP_R")
    private Integer apR;


}
