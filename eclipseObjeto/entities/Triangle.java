package entities;

import java.util.Scanner;

public class Triangle {
	Scanner sc = new Scanner(System.in);
	public double a;
	public double b;
	public double c;
	public double calculateArea() {
		double p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public void getSides() {
		
		System.out.println("Type the length of the 3 sides: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
	}
}
