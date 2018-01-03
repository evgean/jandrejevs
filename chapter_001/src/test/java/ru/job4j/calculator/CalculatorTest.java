package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CalculatorTest {
	@Test
	public void whenAddTwoNumbersThenResult() {
		Calculator calc = new Calculator();
		calc.add(5d, 8d);
		double result = calc.getResult();
		double expected = 13d;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenSubtractTwoNumbersThenResult() {
		Calculator calc = new Calculator();
		calc.subtract(5d, 8d);
		double result = calc.getResult();
		double expected = -3d;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenDivTwoNumbersThenResult() {
		Calculator calc = new Calculator();
		calc.div(100d, 5d);
		double result = calc.getResult();
		double expected = 20d;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenMultipleTwoNumbersThenResult() {
		Calculator calc = new Calculator();
		calc.multiple(5d, 8d);
		double result = calc.getResult();
		double expected = 40d;
		assertThat(result, is(expected));
	}
}