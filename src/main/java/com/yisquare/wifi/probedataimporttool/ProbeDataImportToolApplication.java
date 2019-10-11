package com.yisquare.wifi.probedataimporttool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.yisquare.wifi.probedataimporttool.web.mapper"})
@SpringBootApplication
public class ProbeDataImportToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProbeDataImportToolApplication.class, args);
    }

}
