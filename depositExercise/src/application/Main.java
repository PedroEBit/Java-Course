package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		//ask for account number and holder, and ask if there is an initial value of deposit (overload account operator)
		
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		System.out.print("Enter account number: ");
		int acc_number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String acc_holder = sc.next();
		
		System.out.println("Is there an initial deposit (y/n)?"  );
		char choice = sc.next().charAt(0);
		boolean askdeposit = true;
		
		while(askdeposit == true) {
			if(choice == 'y') {
				float first_deposit = sc.nextInt();
				acc = new Account(acc_number, acc_holder, first_deposit);
				askdeposit=false;
			} else if(choice == 'n') {
				acc = new Account(acc_number, acc_holder);
				askdeposit=false;
			} else {
				System.out.println("Your choice was: "+choice);
				System.out.println("Number not valid, please input a valid command: ");
				choice = sc.next().charAt(0);
			}
		}
		
		System.out.println("\nAccount Data:");
		System.out.println(acc);

		System.out.print("\nEnter a deposit value: ");
		float d_value= sc.nextFloat();
		acc.deposit(d_value);
		
		System.out.println("\nUpdated Account Data:");
		System.out.println(acc);

		
		System.out.print("\nEnter a withdraw value: ");
		float w_value= sc.nextFloat();
		acc.withdraw(w_value);

		System.out.println("\nUpdated Account Data:");
		System.out.println(acc);
		
		sc.close();
	}
}
