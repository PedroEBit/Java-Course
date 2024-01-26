package application;

import java.util.Scanner;

import entities.Alunos;

public class Main {

	public static void main(String[] args) {
		float mediaaltura = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas vão ser listadas?");
		int n = sc.nextInt();
		sc.nextLine();
		int menor16 = 0;
		Alunos[] alunos = new Alunos[n];
		Alunos[] menor16vec = null;
		
		for(int i=0; i< n; i++) {
			
			System.out.printf("\tComeçando novo cadastro\n");
			
			System.out.println("Digite seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Digite sua altura: ");
			float altura = sc.nextFloat();
			
			sc.nextLine();
			alunos[i] = new Alunos(nome, idade, altura);
			
			System.out.println(alunos[i].toString());
			mediaaltura += altura;
			if(alunos[i].getIdade() < 16) {
				menor16++;
			}
			
		}
		menor16vec = new Alunos[menor16];
		
		int index = 0; // Initialize an index for menor16vec
		for (int j = 0; j < n; j++) {
		    if (alunos[j].getIdade() < 16) {
		        menor16vec[index] = alunos[j];
		        index++; // Increment the index for menor16vec
		        System.out.println("Added to menor16vec: " + alunos[j].getNome());
		    }
		}
		
		System.out.println("\nMédia de alturas: "+mediaaltura/n);
		System.out.println("\nPessoas com menos de 16 anos: " + (100* menor16 /n) + "%");
		for(int i=0; i<menor16; i++) {
			System.out.println(menor16vec[i]);
			System.out.println(" ");
		}
		
		sc.close();
		
	}
	
}
