package com.yisquare.wifi.probedataimporttool.web.service.impl;

import com.yisquare.wifi.probedataimporttool.web.entity.BusiShopPubSpace;
import com.yisquare.wifi.probedataimporttool.web.mapper.BusiShopPubSpaceMapper;
import com.yisquare.wifi.probedataimporttool.web.service.IBusiShopPubSpaceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺公共区域关系映射表
（
增加新的6、7、8、9、10映射关系,用于表示跨楼层类型与其他类型（2或4）并存的情况
1、当有公区与映射关系2并存时，用6&2=>9表示，无并存关系时用6表示
2、当有公区与映射关系4并存时，用7&8=>10表示 
无并存关系时：1）跨楼层店铺对应的公区用7表示 如上图公区14、15  ; 2) 多对多关系中的公区用8表示 如上图22、23、24店铺对应的公区17
3、之前跨楼层映射关系5，则还是保留，但这里面设置是纯粹跨楼层店铺，不存在什么并存，1、2、3、4 映射也是一样，都是纯粹的
） 服务实现类
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@Service
public class BusiShopPubSpaceServiceImpl extends ServiceImpl<BusiShopPubSpaceMapper, BusiShopPubSpace> implements IBusiShopPubSpaceService {

}
