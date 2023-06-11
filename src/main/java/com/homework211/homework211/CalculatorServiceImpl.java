package com.homework211.homework211;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public Integer plus(Integer num1, Integer num2) {
        if(num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один или несколько параметров отсутствуют");
        }
        Integer res = num1 + num2;
        return res;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if(num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один или несколько параметров отсутствуют");
        }
        Integer res = num1 - num2;
        return res;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if(num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один или несколько параметров отсутствуют");
        }
        Integer res = num1 * num2;
        return res;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if(num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один или несколько параметров отсутствуют");
        }
        if(num2 == 0) {
            throw new DivideByZeroException("На ноль делить нельзя");
        }
        Integer res = num1 / num2;
        return res;
    }
    @Override
    public String welcomeMessage() { return "Добро пожаловать в калькулятор.";}
}
