package ru.job4j.array;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class FindLoop {
	public int indexOf(int[] data, int el) {
		int rslt = -1;
		
		for (int index = 0; index != data.length; index++) {
			if (data[index] == el) {
				rslt = index;
				
				break;
			}
		}
		
		return rslt;
	}
}