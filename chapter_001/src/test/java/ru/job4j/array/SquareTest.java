package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;


/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
public class SquareTest {
	@Test
	public void whenArrayThree() {
		Square arrObj = new Square();
		int[] arr = arrObj.calculate(3);
		int[] expected = new int[] {1, 4, 9};
		assertArrayEquals(arr, expected);
	}
	
	@Test
	public void whenArrayFour() {
		Square arrObj = new Square();
		int[] arr = arrObj.calculate(4);
		int[] expected = new int[] {1, 4, 9, 16};
		assertArrayEquals(arr, expected);
	}
}