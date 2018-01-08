package ru.job4j.max;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class MaxTest {
	/**
	* Test maximum value
	*/
	
	@Test
	public void whenSecondNumBigger() {
		Max maximum = new Max();
		int resault = maximum.max(10, 26);
		assertThat(resault, is(26));
	}
	
	@Test
	public void whenFirstNumBigger() {
		Max maximum = new Max();
		int resault = maximum.max(15, -1);
		assertThat(resault, is(15));
	}
	
	@Test
	public void whenTwoNumEqual() {
		Max maximum = new Max();
		int resault = maximum.max(5, 5);
		assertThat(resault, is(5));
	}
	
	@Test
	public void whenThreeNumMax() {
		Max maximum = new Max();
		int resault = maximum.max(5, 2, 4);
		assertThat(resault, is(5));
	}
}