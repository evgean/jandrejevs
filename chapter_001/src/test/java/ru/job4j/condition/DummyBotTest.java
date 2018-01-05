package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class DummyBotTest {
	@Test
	public void whenSayHiThenAnswer() {
		DummyBot bot = new DummyBot();
		String answer = bot.botAnswer("Hi, bot");
		assertThat(answer, is("Hi, dick ass"));
	}
		
	@Test
	public void whenSayByeThenAnswer() {
		DummyBot bot = new DummyBot();
		String answer = bot.botAnswer("Bye");
		assertThat(answer, is("See you soon"));
	}
	
	@Test
	public void whenSaySomeThenAnswer() {
		DummyBot bot = new DummyBot();
		String answer = bot.botAnswer("So what?");
		assertThat(answer, is("It's puzzle me. Ask something else .."));
	}
	
	@Test
	public void whenSaySomeElseThenAnswer() {
		DummyBot bot = new DummyBot();
		String answer = bot.botAnswer("Ar you bot?");
		assertThat(answer, is("It's puzzle me. Ask something else .."));
	}
}