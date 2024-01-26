package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {
	Scanner sc = new Scanner(System.in);
	int n;
	int col;
	int lin;
	int matriz[][] = null;

	public Matrix(int n) {
		super();
		this.n = n;
	}
	
	public int[][] buildmatriz() {
		int matriz[][] = new int[n][n];
		for(int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		return matriz;
	}

	public void printmatriz(int[][] matrix) {
		System.out.print("[");
		for(int i = 0; i<n; i++) {
			if(i > 0) System.out.print(" ");
			System.out.print("[");
			for(int j = 0; j<n; j++) {
				System.out.print(matrix[i][j]);
				if (j<n-1) System.out.print(" ");
			}
			System.out.print("],\n");
		}
		System.out.print("]");
	}
	public List<Integer> contanegativos(int[][] matriz) {
		List<Integer> listnegativos = new ArrayList<Integer>();
		for(int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				if(matriz[i][j] < 0) listnegativos.add(matriz[i][j]);
			}
		}
		return listnegativos;
	}

	public List<Integer> diagonalprincipal(int[][] matriz) {
		List<Integer> maindiag = new ArrayList<Integer>();
		for(int i=0; i<n;i++) {
			for (int j=0; j<n; j++) {
				if(i == j) maindiag.add(matriz[i][j]);
			}
		}
		
		return maindiag;
	}
	
	
}