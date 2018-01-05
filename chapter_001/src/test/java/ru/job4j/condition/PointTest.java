package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
	@Test
	public void whenAddTwoPointsThenResult() {
		Point pointOne = new Point(10, 20);
		Point pointTwo = new Point(7, 16);
		double result = pointOne.distanceTo(pointTwo);
		double expected = 5d;
		assertThat(result, is(expected));
	}
}