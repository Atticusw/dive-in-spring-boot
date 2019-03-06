package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;
@Profile("java7")
@Service
public class Java7CalculateServiceImpl implements CalculateService{
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java 7 Lambda 实现");
        int sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;

    }
}
