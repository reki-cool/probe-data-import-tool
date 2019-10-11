package com.yisquare.wifi.probedataimporttool.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 店铺铺位信息表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_SHOP_BERTH_INFO")
public class BusiShopBerthInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "BERTH_ID", type = IdType.AUTO)
    private Long berthId;

    /**
     * 铺位号
     */
    @TableField("BERTH_NAME")
    private String berthName;

    /**
     * 楼层编号
     */
    @TableField("FLOOR_ID")
    private Long floorId;


}
