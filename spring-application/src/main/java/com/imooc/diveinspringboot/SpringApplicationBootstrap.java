package com.imooc.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: XINSHIQU
 * @Description:{@link SpringApplication} 引导类 </br>
 * @version: 1.0 </br>
 * @Copyright: Copyright (c) 2015-2018 All Rights Reserved. </br>
 * @Company: www.eaytjoys.com Inc. </br>
 * @Date: 2019-03-06 17:36
 */

public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        //springApplicationBootstrap可以是任意的配置类，不一定是主类
//        SpringApplication.run(SpringApplicationBootstrap.class,args);

        //配置类集合
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        //application
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println("bean " + context.getBean(ApplicationConfiguration.class));

    }

    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
