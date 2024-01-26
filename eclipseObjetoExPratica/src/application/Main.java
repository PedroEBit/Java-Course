package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double dollarprice, dollartarget, reaisneeded;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanto está o preço do dólar?: ");
		dollarprice = sc.nextDouble();
		System.out.print("Quantos dólares você quer comprar?: ");
		dollartarget = sc.nextDouble();
		reaisneeded = CurrencyConverter.converter(dollarprice, dollartarget);
		System.out.println("Você precisará comprar "+reaisneeded+" reais.");
	}


}
