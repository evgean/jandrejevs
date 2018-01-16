package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
public class BubbleSortTest {
	@Test
	public void whenEvenArr() {
		BubbleSort object = new BubbleSort();
		int[] arr = new int[] {2, 10, 3, 11, 22, 3};
		int[] expected = new int[] {2, 3, 3, 10, 11, 22};
		int[] rslt = object.sort(arr);
		assertArrayEquals(expected, (rslt));
	}
	
	@Test
	public void whenOddArr() {
		BubbleSort object = new BubbleSort();
		int[] arr = new int[] {4, 1, 22, 11231, 43, 3, 4};
		int[] expected = new int[] {1, 3, 4, 4, 22, 43, 11231};
		int[] rslt = object.sort(arr);
		assertArrayEquals(expected, (rslt));
	}
	
		@Test
	public void whenMinusAndSameNumArr() {
		BubbleSort object = new BubbleSort();
		int[] arr = new int[] {-4, 1, 22, 11231, 22, 3, 22};
		int[] expected = new int[] {-4, 1, 3, 22, 22, 22, 11231};
		int[] rslt = object.sort(arr);
		assertArrayEquals(expected, (rslt));
	}
}