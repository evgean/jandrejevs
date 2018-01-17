package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
public class MatrixTest {
	@Test
	public void whenMatrixThree() {
		Matrix obj = new Matrix();
		int[][] rslt = obj.multiple(3);
		int[][] expected = new int[][]{{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
		assertArrayEquals(expected, (rslt));
	}
	
	@Test
	public void whenMatrixFive() {
		Matrix obj = new Matrix();
		int[][] rslt = obj.multiple(5);
		int[][] expected = new int[][]{{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};
		assertArrayEquals(expected, (rslt));
	}
}