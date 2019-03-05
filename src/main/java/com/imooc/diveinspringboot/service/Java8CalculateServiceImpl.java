package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("java8")
@Service
public class Java8CalculateServiceImpl implements CalculateService{
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java8");
        Integer tatol = new Integer(0);
        for(int i=0; i<values.length; i++){
            tatol +=values[i];
        }
        return tatol;
    }
}
