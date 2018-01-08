package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class CounterTest {
	@Test
	public void whenAddTwoNumberThenSumOddNum() {
		Counter cnt = new Counter();
		int result = cnt.add(1, 15);
		assertThat(result, is(56));
	}
}