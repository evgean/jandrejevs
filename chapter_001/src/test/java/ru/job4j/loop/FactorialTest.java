package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*@author Javgenijs A.
*@version $Id$
*@since 0.1
*/

public class FactorialTest {
	@Test
	public void whenAddNumThenFactorial() {
		Factorial fac = new Factorial();
		int result = fac.calc(5);
		assertThat(result, is(120));
	}
	
		@Test
	public void whenAddZeroThenFactorialOne() {
		Factorial fac = new Factorial();
		int result = fac.calc(0);
		assertThat(result, is(1));
	}
}