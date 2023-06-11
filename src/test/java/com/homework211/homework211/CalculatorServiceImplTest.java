package com.homework211.homework211;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    public void correctlyAdd() {
        Integer expected = 1 + 2;
        Integer actual = calculatorService.plus(1, 2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void correctlyThrowSumException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {Integer actual = calculatorService.plus(null, 0);});;
    }
    @Test
    public void correctlySubtract() {
        Integer expected = 2 - 2;
        Integer actual = calculatorService.minus(2, 2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void correctlyThrowDifferenceException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {Integer actual = calculatorService.minus(null, null);});;
    }
    @Test
    public void correctlyMultiply() {
        Integer expected = 6 * 8;
        Integer actual = calculatorService.multiply(6, 8);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void correctlyThrowMultiplicationException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {Integer actual = calculatorService.multiply(1, null);});;
    }
    @Test
    public void correctlyDivide() {
        Integer expected = 8 / 4;
        Integer actual = calculatorService.divide(8, 4);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void correctlyThrowDivisionException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {Integer actual = calculatorService.divide(5, null);});;
    }
    @Test
    public void correctlyThrowDivideByZeroException() {
        Assertions.assertThrows(DivideByZeroException.class, () ->
        {Integer actual = calculatorService.divide(5,0);});;
    }
}
