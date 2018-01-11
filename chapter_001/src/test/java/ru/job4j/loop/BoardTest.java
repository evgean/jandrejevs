package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */

public class BoardTest {
	@Test
	public void when3x3() {
		Board board = new Board();
		String rslt = board.paint(3, 3);
		String lineEnd = System.lineSeparator();
		assertThat(rslt, is("X X" + lineEnd + " X " + lineEnd + "X X" + lineEnd));
	}
	
	@Test
	public void when4x2() {
		Board board = new Board();
		String rslt = board.paint(4, 2);
		String lineEnd = System.lineSeparator();
		assertThat(rslt, is("X X " + lineEnd + " X X" + lineEnd));
	}
}