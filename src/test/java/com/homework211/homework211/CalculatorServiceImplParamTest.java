package com.homework211.homework211;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(5, 3),
                Arguments.of(7, 2),
                Arguments.of(1, 10),
                Arguments.of(7, 3)
        );
    }
    private static Stream<Arguments> argumentsStreamForDivision() {
        return Stream.of(
                Arguments.of(6, 3),
                Arguments.of(7, 2),
                Arguments.of(100, 10),
                Arguments.of(7, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void correctlyAdd(Integer num1, Integer num2) {
        Integer expected = num1 + num2;
        Integer actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void correctlySubtract(Integer num1, Integer num2) {
        Integer expected = num1 - num2;
        Integer actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void correctlyMultiply(Integer num1, Integer num2) {
        Integer expected = num1 * num2;
        Integer actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("argumentsStreamForDivision")
    public void correctlyDivide(Integer num1, Integer num2) {
        Integer expected = num1 / num2;
        Integer actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
}
