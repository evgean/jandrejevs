package ru.job4j.loop;

/**
* Программа рисует шахматную достку
*@author Jevgenijs A.
*@version $Id$ 
*@since 0.1
*/

public class Board {
	/**
	* Метод paint рисует шахматную доску
	*@param width - длина
	*@param height - высота
	*@return сроки ввиде доски
	*/
	
	public String paint(int width, int height) {
		
		String lineEnd = System.lineSeparator();
		StringBuilder scr = new StringBuilder();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					scr.append("X");
				} else {
					scr.append(" ");
				}
			}
			scr.append(lineEnd);
		}
		
		return scr.toString();
	}
}