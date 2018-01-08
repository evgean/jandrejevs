package ru.job4j.loop;

/**
* Программа вычисляет сумму всех четных числе в указаннои диапазоне
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Counter {
	/**
	* Метод add складывает все четные симла в квазанном диапазонеы
	*@param start - число от которого начинаем считать
	*@param finish - последнее число диапазона
	*@return - сумму всех четных исел
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				result = result + i;
			}
		}
		return result;
	}
}