package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.imooc.diveinspringboot.service")
public class CalculateBootstrapService {
    public static void main(String[] args) {
        ConfigurableApplicationContext builder = new SpringApplicationBuilder(CalculateBootstrapService.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);

        CalculateService bean = builder.getBean(CalculateService.class);
        System.out.println("tatal: " + bean.sum(1,2,3,4,5));
    }
}
