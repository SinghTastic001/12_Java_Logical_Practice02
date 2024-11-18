package Sum_first_n_num;

import java.util.Scanner;

class sum{
	
	public static int getSum(int num) {
		return num * (num+1)/2;
	}
}

public class SumFirst {

	public static void main(String[] args) {
		
//		System.out.println("Enter a number ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		for(int i=1; i<=num; i++) {
//			
//			sum = sum +i;
//		}
//		
//		System.out.println(sum);
		
		 int num1 = sum.getSum(3);
		 System.out.println(num1);
		
		
	}
}
