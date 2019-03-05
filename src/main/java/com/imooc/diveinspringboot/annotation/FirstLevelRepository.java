package com.imooc.diveinspringboot.annotation;


import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * 一级注解{@link Repository}
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface  FirstLevelRepository {
    String value() default "";
}
