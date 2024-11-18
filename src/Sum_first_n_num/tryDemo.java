package Sum_first_n_num;

import java.util.Scanner;

public class tryDemo {
	
	public static void main(String[] arg) {
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		int sum = 0;
		for(int i= val; i>0; i--) {
			
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
