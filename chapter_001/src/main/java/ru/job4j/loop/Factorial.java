package ru.job4j.loop;

/**
* Программа вычисляет факториал
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Factorial {
	/**
	* Метод calc вычисляет факориал
	*@param n - число которому необходимо вычислить факториал
	*@return возвращает факториал числа n
	*/
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}