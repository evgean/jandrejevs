package ru.job4j.max;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Max {
	/**
	*class Max вычисляет максимальное значение из двух чисел
	*@param firs, second - два числа из которых выявляется наибольшее
	*/
	
	public int max(int first, int second) {
		int resault = -1;
		
		if (first >= second) {
			resault = first;
		} else {
			resault = second;
		}
		
		return resault;
	}
}