package com.imooc.diveinspringboot;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//springApplication事件引导类
public class SpringApplicationEventBootstrp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();


        //注册应用事件监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件 " + event);
        });
        //启动上下文
        context.refresh();

        context.publishEvent("hello world");
        //自定义传播事件
        context.publishEvent(new ApplicationEvent("king"){

                             }
        );


        //关闭
        context.close();
    }
}
