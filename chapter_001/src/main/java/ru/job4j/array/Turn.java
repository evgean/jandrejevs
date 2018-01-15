package ru.job4j.array;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Turn {
	public int[] back(int[] array) {
		for (int index = 0; index != array.length; index++) {
			if (array.length % 2 == 0) {
				int tempInt = array[index];
				array[index] = array[(array.length - 1) - index];
				array[(array.length - 1) - index] = tempInt;
				
				if (index + 1 == array.length / 2) {
					break;
				}
			} else {
				int tempInt = array[index];
				array[index] = array[(array.length - 1) - index];
				array[(array.length - 1) - index] = tempInt;
				
				if (index + 1 == (array.length + 1) / 2) {
					break;
				}
			}
		}
		
		return array;
	}
}