package com.wimoor;

import com.wimoor.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zeno
 * @Date: 2023/10/25 14:27
 * @Description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@ComponentScan
public class OzonApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context  = SpringApplication.run(OzonApplication.class, args);
        SpringUtil.set(context);
    }

}
