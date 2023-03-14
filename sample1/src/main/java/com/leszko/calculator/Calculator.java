package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Adding two integers to get the sum
*/
@Service
public class Calculator {
        String UMLNUMBER = "3k";
        @Cacheable("sum")
        public int sum(int a, int b) {
                return a + b;
        }
}
