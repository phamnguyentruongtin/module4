package com.example.caculatedservices;

import org.springframework.stereotype.Service;

@Service
public class CaculatedServices implements ICaculatedService {

    @Override
    public float caculated(float num1, float num2, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
