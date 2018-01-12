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

public class PaintTest {
	@Test
	public void whenThreeSymbols() {
		Paint pir = new Paint();
		String res = pir.piramid(3);
		assertThat(res, is(
			new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
			.add("  ^  ")
			.add(" ^^^ ")
			.add("^^^^^")
			.toString()
		));
	}
	
		@Test
	public void whenFiveSymbols() {
		Paint pir = new Paint();
		String res = pir.piramid(5);
		assertThat(res, is(
			new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
			.add("    ^    ")
			.add("   ^^^   ")
			.add("  ^^^^^  ")
			.add(" ^^^^^^^ ")
			.add("^^^^^^^^^")
			.toString()
		));
	}
}