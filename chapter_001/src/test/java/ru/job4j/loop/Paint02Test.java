package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
public class Paint02Test {
	@Test
	public void whenPyramid4Left() {
		Paint02 paint = new Paint02();
		String rst = paint.leftTrl(4);
		System.out.println(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("   ^")
								.add("  ^^")
								.add(" ^^^")
								.add("^^^^")
								.toString()
				)
		);
	}
	
	@Test
	public void whenPyramid4Right() {
		Paint02 paint = new Paint02();
		String rst = paint.rightTrl(4);
		System.out.println(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("^   ")
								.add("^^  ")
								.add("^^^ ")
								.add("^^^^")
								.toString()
				)
		);
	}
	
	@Test
	public void whenPyramid() {
		Paint02 paint = new Paint02();
		String rst = paint.pyramid(4);
		System.out.println(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("   ^   ")
								.add("  ^^^  ")
								.add(" ^^^^^ ")
								.add("^^^^^^^")
								.toString()
				)
		);
	}
}