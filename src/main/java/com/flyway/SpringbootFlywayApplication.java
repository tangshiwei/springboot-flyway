package com.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *   注：根据你配置的数据源信息或 Flyway 信息创建好对应的数据库
 *
 *   1. 项目启动成功后，到对应的数据库中刷新，即可看到 Flyway 创建的表
 *
 *   2. 第一次启动的时候，除了主动写的 sql 脚本会被执行以及创建表以外， Flyway 还会自动创建一张历史版本记录的表
 */
@SpringBootApplication
public class SpringbootFlywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFlywayApplication.class, args);
    }

}
