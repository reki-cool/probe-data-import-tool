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
 * 楼层-店铺映射表
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_FLOOR_SHOP")
public class BusiFloorShop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键编号
     */
    @TableId(value = "FS_ID", type = IdType.AUTO)
    private Long fsId;

    /**
     * 店铺主键编号
     */
    @TableField("SHOP_ID")
    private Long shopId;

    /**
     * 楼层主键编号
     */
    @TableField("FLOOR_ID")
    private Long floorId;


}
