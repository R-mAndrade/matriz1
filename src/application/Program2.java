package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Rows: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Enter row values: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Choose a number on the matrix: ");
		int value = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		Integer left = null, right = null, up = null, down = null;
						
		System.out.println();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == value) {
					System.out.println("Number " + value + " on row " + (i+1) + " column " + (j+1));
					System.out.println("Nearby numbers: ");
					try {
						left = mat[i][j-1];
					} catch (IndexOutOfBoundsException e) {
						left = null;
					}
					try {
						right = mat[i][j+1];
					} catch (IndexOutOfBoundsException e) {
						right = null;
					}
					try {
						up = mat[i-1][j];
					} catch (IndexOutOfBoundsException e) {
						up = null;
					}
					try {
						down = mat[i+1][j];
					} catch (IndexOutOfBoundsException e) {
						down = null;
					}
					
					map.put("Left", left);
					map.put("Right", right);
					map.put("Up", up);
					map.put("Down", down);
					
					for(String name : map.keySet()) {
						if(map.get(name) != null) {
							System.out.println(name + " = " + map.get(name));
						}
					}
					System.out.println();
					
				}
			}
		}
		
		sc.close();
		
	}

}
