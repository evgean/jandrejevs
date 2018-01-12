package ru.job4j.loop;

/**
* Программа рисует пирамиду с указанной высотой h
*@author Jevgenijs A.
*@version $Id$ 
*@since 0.1
*/

public class Paint {
	/**
	* Метод repead позволяет повторять сроки нужное количество раз
	*@param s - это срока которую нужно повторить
	*@param time - количество повторов
	*@return - повторенная строка
	*/
	public String repead(String s, int time) {
		StringBuilder buildS = new StringBuilder();
		for (int i = 0; i < time; i++) {
			buildS.append(s);
		}
		return buildS.toString();
	}
	
	/**
	* Метод piramid рисует пирамиду из символов "^" и пробелов.
	*@param h - высота пирамиды
	*@return - символы выстроенные в пирамиду
	*/
	public String piramid(int h) {
		StringBuilder scr = new StringBuilder();
		String lineEnd = System.lineSeparator();
		
		//Для использования метода повторения создаем объект класса Paint
		Paint time = new Paint();
		
		//Создаем переменную которая отвечает за увеличение символа "^" в каждой строке
		int incr = 1;
		
		//Создаем цикл который отвечает за количество рядов
		for (int i = h; i > 0; i--) {
			//Создаем строку основанную на симетрии пирамиды
			scr.append(time.repead(" ", (i - 1))).append(time.repead("^", incr)).append(time.repead(" ", (i - 1))).append(lineEnd);
			incr = incr + 2;
		}
		return scr.toString();
	}
}