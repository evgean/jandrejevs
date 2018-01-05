package ru.job4j.condition;

/**
* Класс Point вычисляет растояние между двумя точками. 
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	/**
	* метод twoDecimalPlaces позволяет приводить числа к дестичным дробям с двумя точками после запятой.
	*@param result - число которое нужно привести к дроби.
	*@return result - приведенная дробь.
	*/
	
	public double twoDecimalPlaces(double result) {
		result = result * 100;
		result = Math.round(result);
		result = result / 100;
		
		return result;
	}

	/**
	* метод distanceTo вычисляет растояние между вдух точек.
	*@param that - координаты <b>Второй</b> точки.
	*@return result - вычесленная длина.
	*/
	
	public double distanceTo(Point that) {
		Point myPoint = this;
		Point newPoint = that;

		int x1 = myPoint.x;
		int x2 = newPoint.x;
		int y1 = myPoint.y;
		int y2 = newPoint.y;
		
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
		
		return result;
	}

	/**
	* метод formToPrintResult выводит результат вычисления в красивый форме.
	*@param result - вычесленное растояние методом <b>distanceTo</b>.
	*/
	
	public void formToPrintResult(double result) {
		System.out.println("Distance between two points is : " + result);
		result = twoDecimalPlaces(result);
		System.out.println("A <------- " + result + "m -------> B");
	}
	
	/**
	* метод main вычисляет расстояние между двумя точками.
	*@param args - args.
	*/	
	
    public static void main(String[] args) {

        Point myPoint = new Point(3, 8);
        Point newPoint = new Point(7, 4);
		double result = myPoint.distanceTo(newPoint);
		myPoint.formToPrintResult(result);
    }
}