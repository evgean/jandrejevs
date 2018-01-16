package ru.job4j.array;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class BubbleSort {
	public int[] sort(int[] array) {
		int lastIndex = array.length - 1;
		while (lastIndex != 0) {
			for (int index = 0; index != lastIndex; index++) {
				if (array[lastIndex] <= array[index]) {
					int temp = array[lastIndex];
					array[lastIndex] = array[index];
					array[index] = temp;
				}
			}
			lastIndex--;
		}
		return array;
	}
}