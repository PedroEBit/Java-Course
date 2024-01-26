package application;

import java.util.List;
import java.util.Scanner;

import entities.Matrix;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da sua matriz: ");
		int n = sc.nextInt();
		
		Matrix matrizsetter = new Matrix(n);
		
		int [][] matrix = matrizsetter.buildmatriz();
		
		matrizsetter.printmatriz(matrix);
		sc.close();
		
		List<Integer> negativos = matrizsetter.contanegativos(matrix);
		System.out.println("\n\tA lista dos números negativos é: " + negativos);
		System.out.println("\tExistem " + negativos.size() + " números negativos");
		
		List<Integer> maindiag = matrizsetter.diagonalprincipal(matrix);
		System.out.println("\tA diagonal principal é: " + maindiag);
	}

}
