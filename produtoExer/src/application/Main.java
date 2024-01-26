package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		
//		System.out.print("Quantity: ");
//		int quantity = sc.nextInt();
//
//		Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);

		System.out.println("Total value of " 
		+ product.getName() 
		+ " in stock is USD " 
		+ product.TotalValueInStock()
		+ ", considering the individual price of USD " 
		+ product.getPrice() 
		+ " each");
		System.out.println(product);

		product.removeProducts(sc.nextInt());
		System.out.println(product);

		product.addProducts(sc.nextInt());
		System.out.println(product);
		sc.close();
	}

}
