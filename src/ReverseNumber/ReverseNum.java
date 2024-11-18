package ReverseNumber;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		String string = String.valueOf(in);
		
		String new_num = "";
		
		
		for(int i= string.length()-1; i>=0; i--) {
			
			new_num = new_num + string.charAt(i);
		}
		Integer num = Integer.valueOf(new_num);
		System.out.println(num);
	}
}
