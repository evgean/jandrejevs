package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class TriangleTest {
	@Test
	public void whenThreePointThenAreaTrue() {
		// Создаем три точки на плоскостти
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		
		// Создаем треугольник
		Triangle abc = new Triangle(a, b, c);
		
		// Вычисляем площадь
		double result = abc.area();
		double expected = 2D;
		// Проверяем
		assertThat(result, closeTo(expected, 0.1));
	}
}