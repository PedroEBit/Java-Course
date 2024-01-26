package application;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Triangle x = new Triangle();
		x.getSides();
		double ax = x.a;
		double bx = x.b;
		double cx = x.c;
		Triangle y = new Triangle();
		y.getSides();
		double ay = y.a;
		double by = y.b;
		double cy = y.c;
		double area_x = x.calculateArea();
		double area_y = y.calculateArea();
		System.out.println("No triângulo x:\n\tLado a: " + ax +  "\n\tLado b: "+bx+ "\n\tLado c: " + cx);
		System.out.println("No triângulo y:\n\tLado a: " + ay +  "\n\tLado b: "+by+ "\n\tLado c: " + cy);
		System.out.println("A área do triângulo x é de " + area_x + "cm^2");
		System.out.println("A área do triângulo y é de " + area_y + "cm^2");
		comparacaotri(area_x,area_y);
	}

	private static void comparacaotri(double area_x, double area_y) {
		if(area_x > area_y) {
			System.out.println("O triângulo maior é x");
			return;
		}
			System.out.println("O triângulo maior é y");
			return;
	}


}
