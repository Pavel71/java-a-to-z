package ru.pmishagin.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test

    public void whenAddOnePlusOneThenTwo() {

        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test

    public void whenSubtractThreeMinusOneThenTwo() {

        Calculator calc = new Calculator();
        calc.subtract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivFourDivisionTwoThenTwo() {

        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipliOneMultiplitcationTwoThenTwo() {

        Calculator calc = new Calculator();
        calc.multipli(1D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}