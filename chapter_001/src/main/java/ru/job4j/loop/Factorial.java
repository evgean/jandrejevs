package ru.job4j.loop;

/**
* Программа вычисляет факториал
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Factorial {
	/**
	* Метод calc вычисляет фаториал
	*@param n - число которому необходимо вычислить факториал
	*@return возвращает факториал числа n
	*/
	public int calc(int n) {
		if (n > 0) {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		} else {
			return 1;
		}
		
	}
}