package com.bonc.ttms.gaming.server.service.admin;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bonc.ttms.gaming.server.service.admin.api.*.dao")
public class GamingServerServicceAdminApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext run = run(GamingServerServicceAdminApplication.class, args);
        SpringApplication.run(GamingServerServicceAdminApplication.class, args);
        Main.main(args);
    }
}
