package com.yisquare.wifi.probedataimporttool.web.controller;


import com.yisquare.wifi.probedataimporttool.web.entity.BusiAp;
import com.yisquare.wifi.probedataimporttool.web.service.IBusiApService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 探针信息表 前端控制器
 * </p>
 *
 * @author duyanhan
 * @since 2019-10-11
 */
@RestController
@RequestMapping("/web/busi-ap")
public class BusiApController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IBusiApService iBusiApService;

    @ResponseBody
    @GetMapping("test")
    public String test() {
        List<BusiAp> list = iBusiApService.list();
        logger.info(list.toString());
        return list.toString();
    }
}
