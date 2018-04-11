package com.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <br></br>
 *
 * @version 1.0
 * @author: XieNengYan
 * @email 373309446@qq.com
 * @date: 2018/4/11 10:50
 */
@SpringBootApplication
@EnableEurekaClient
public class MailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }
}
