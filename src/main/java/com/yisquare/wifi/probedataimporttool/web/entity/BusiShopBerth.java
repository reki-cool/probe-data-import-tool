package com.yisquare.wifi.probedataimporttool.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_SHOP_BERTH")
public class BusiShopBerth implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 铺位信息编号
     */
    @TableField("BERTH_ID")
    private Long berthId;

    /**
     * 店铺编号
     */
    @TableField("SHOP_ID")
    private Long shopId;


}
