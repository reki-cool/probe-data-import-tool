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
 * 
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_SHOP_BERTH_SPACE")
public class BusiShopBerthSpace implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "BPC_ID", type = IdType.AUTO)
    private Long bpcId;

    @TableField("BERTH_ID")
    private Long berthId;

    @TableField("SPACE_ID")
    private Long spaceId;


}
