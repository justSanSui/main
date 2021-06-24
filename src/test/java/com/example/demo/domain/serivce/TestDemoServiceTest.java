package com.example.demo.domain.serivce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoServiceTest {

@Autowired
private TestDemoService testDemoService;

    @Test
    void strStr() {
    }

    @Test
    void countAndSay() {
        String s = testDemoService.countAndSay(4);
        System.out.println(s);
    }
}