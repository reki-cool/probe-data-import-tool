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
 * 店铺公共区域关系映射表
（
增加新的6、7、8、9、10映射关系,用于表示跨楼层类型与其他类型（2或4）并存的情况
1、当有公区与映射关系2并存时，用6&2=>9表示，无并存关系时用6表示
2、当有公区与映射关系4并存时，用7&8=>10表示 
无并存关系时：1）跨楼层店铺对应的公区用7表示 如上图公区14、15  ; 2) 多对多关系中的公区用8表示 如上图22、23、24店铺对应的公区17
3、之前跨楼层映射关系5，则还是保留，但这里面设置是纯粹跨楼层店铺，不存在什么并存，1、2、3、4 映射也是一样，都是纯粹的
）
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("BUSI_SHOP_PUB_SPACE")
public class BusiShopPubSpace implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "SPC_ID", type = IdType.AUTO)
    private Long spcId;

    /**
     * 店铺ID
     */
    @TableField("SHOP_ID")
    private Long shopId;

    /**
     * 公共区域ID
     */
    @TableField("SPACE_ID")
    private Long spaceId;

    /**
     * 映射关系：1-一对一 2-一对多 3-多对一 4-多对多 5-跨楼层 6-跨楼层(与2并存) 7-跨楼层(与4并存) 8-跨楼层(与4并存) 9-跨楼层(与2并存) 10-跨楼层(与4并存)：：：跨楼层的详细说明看表注释
     */
    @TableField("MAPPING_TYPE")
    private Integer mappingType;


}
