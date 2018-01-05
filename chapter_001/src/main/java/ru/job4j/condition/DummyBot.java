package ru.job4j.condition;

/**
*@author Jevgenijs A.
*@version $Id@
*@since 0.1
*/

public class DummyBot {
	/** переменная для сравнения введенной фразы */
	private String inputHi = "Hi, bot";
	/** переменная для сравнения введенной фразы */
	private String inputBye = "Bye";
	
	/**
	* метод <b>botAnswer</b> сравнивает введенную фразу и выдает ответ бота.
	*@param input - вводимая фраза.
	*@return answer - ответ бота
	*/
	public String botAnswer(String input) {
		String answer = "It's puzzle me. Ask something else ..";
		
		if (input.equals(inputHi)) {
			answer = "Hi, dick ass";
		} else if (input.equals(inputBye)) {
			answer = "See you soon";
		}
		
		return answer;
	}
}