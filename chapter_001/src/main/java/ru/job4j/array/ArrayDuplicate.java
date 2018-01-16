package ru.job4j.array;

import java.util.Arrays;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class ArrayDuplicate {
	public String[] remove(String[] array) {
		//переменная отвечающая за количество циклов. При нахождении совпадений значение переносится
		//  в конец масиива и цикл уменьшается на один
		int copyLoop = array.length;
		
		//значение которое сравнивает
		//out должен проверяться на < copyLoop т.к. при != возможна ситуации перескока
		for (int out = 0; out < copyLoop; out++) {
			//значение с которым сравнивается
			for (int in = 0; in < copyLoop; in++) {
				//если значение равны и не сравнивается одно и тоже значение
				if (array[in].equals(array[out]) && in != out) {
					String temp = array[in];
					array[in] = array[copyLoop - 1];
					array[copyLoop - 1] = temp;
					copyLoop--;
				}
			}
		}
		
		return Arrays.copyOf(array, copyLoop);
	}
}