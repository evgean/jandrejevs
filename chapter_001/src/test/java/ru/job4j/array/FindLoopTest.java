package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
 public class FindLoopTest {
	 @Test
	 public void whenFindIndexFive() {
		 FindLoop loop = new FindLoop();
		 int[] arr = new int[] {2, 4, 6, 3, 5, 7, 9};
		 int rslt = loop.indexOf(arr, 7);
		 int expected = 5;
		 assertThat(expected, is(rslt));
	 }
	 
	 @Test
	 public void whenFindIndexMinusOne() {
		 FindLoop loop = new FindLoop();
		 int[] arr = new int[] {2, 4, 6, 3, 5, 7, 9};
		 int rslt = loop.indexOf(arr, 11);
		 int expected = -1;
		 assertThat(expected, is(rslt));
	 }
 }