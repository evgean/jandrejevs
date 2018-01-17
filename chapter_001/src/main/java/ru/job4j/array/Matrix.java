package ru.job4j.array;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Matrix {
	public int[][] multiple(int size) {
		int[][] mult = new int[size][size];
		for (int column = 1; column <= size; column++) {
			for (int row = 1; row <= size; row++) {
				mult[column - 1][row - 1] = column * row;
			}
		}
		
		return mult;
	}
}