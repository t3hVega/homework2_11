package com.homework211.homework211;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("")
    public String welcomeMessage() {
        return calculatorService.welcomeMessage();
    }
    @GetMapping("/plus")
    public String plus (
            @RequestParam(required=false,name="num1") Integer num1,
            @RequestParam(required=false,name="num2") Integer num2
    ) {
        return calculatorService.plus(num1, num2).toString();
    }
    @GetMapping("/minus")
    public String minus (
            @RequestParam(required=false,name="num1") Integer num1,
            @RequestParam(required=false,name="num2") Integer num2
    ) {
        return calculatorService.minus(num1, num2).toString();
    }
    @GetMapping("/multiply")
    public String multiply (
            @RequestParam(required=false,name="num1") Integer num1,
            @RequestParam(required=false,name="num2") Integer num2
    ) {
        return calculatorService.multiply(num1, num2).toString();
    }
    @GetMapping("/divide")
    public String divide (
            @RequestParam(required=false,name="num1") Integer num1,
            @RequestParam(required=false,name="num2") Integer num2
    ) {
        return calculatorService.divide(num1, num2).toString();
    }
}
