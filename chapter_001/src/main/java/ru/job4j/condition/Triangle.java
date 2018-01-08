package ru.job4j.condition;

/**
* Программа вычисляет площадь треугольника
*@author Jevgenijs A.
*@version $Id$
*@since 0.1
*/

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	* Метод period вычисляет полупериметр
	*@param ab растояние между точками a и b
	*@param ac растояние между точками a и c
	*@param cb растояние между точками c и b
	*@return полупериметр
	*/
	public double period(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2;
	}
	
	/**
	* Метод exist вычисляет существует ли треугольник
	*@param ab растояние между точками a и b
	*@param ac растояние между точками a и c
	*@param cb растояние между точками c и b
	*@return true если существует
	*/
	public boolean exist(double ab, double ac, double bc) {
		return (ab + ac) > bc && (ac + bc) > ab && (bc + ab) > ac;
	}
	
	/**
	* Метод area вычисляет площадь треугольника
	*@return площадь треугольника, если она существует или -1 если нет
	*/
	
	public double area() {
		double resault = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.period(ab, ac, bc);

		if (this.exist(ab, ac, bc)) {
			double res1 = (p * (p - ab));
			System.out.println("1 thing " + res1);
			double res2 = (p * (p - ac));
			System.out.println("2 thing " + res2);
			double res3 = (p * (p - bc));
			System.out.println("3 thing " + res3);
			resault = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
		}

		return resault;
		
	}
}