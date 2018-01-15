package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
public class TurnTest {
	@Test
	public void whenEvenArray() {
		Turn object = new Turn();
		int[] arr = new int[] {2, 4, 6, 8, 10, 13};
		int[] expected = new int[] {13, 10, 8, 6, 4, 2};
		int[] rslt = object.back(arr);
		assertArrayEquals(expected, (rslt));
	}
	
	@Test
	public void whenOddArray() {
		Turn object = new Turn();
		int[] arr = new int[] {4, 6, 8, 10, 13};
		int[] expected = new int[] {13, 10, 8, 6, 4};
		int[] rslt = object.back(arr);
		assertArrayEquals(expected, (rslt));
	}
}