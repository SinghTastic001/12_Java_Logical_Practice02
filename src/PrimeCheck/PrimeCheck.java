package PrimeCheck;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			int count = 0;
			for(int j =1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		
		
	}
}
