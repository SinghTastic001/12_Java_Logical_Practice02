package MatrixDemo;

import java.util.Scanner;

public class DiagonalMatrix {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter matrix 1");
		Scanner sc = new Scanner(System.in);
		
		int[][] m1 = new int[2][2];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Enter matrix 2");
		int[][] m2 = new int[2][2];
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				
				m2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<m2.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] sum = new int[2][2];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				if(m1[i][j]==m2[i][j]) {
					sum[i][j] = m1[i][j]+m2[i][j];
					
				}
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<sum[i].length; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
