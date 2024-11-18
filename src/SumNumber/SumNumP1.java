package SumNumber;

import java.util.Scanner;

// add num like 123456
public class SumNumP1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number here for add ");
		int user_num = sc.nextInt();
		int temp = user_num;
		int sum = 0;
		
		while(temp>0) {
			
			int r = temp%10;
			sum = sum + r;
			temp = temp/10;
		}
		
		System.out.println(sum);
	}

}
