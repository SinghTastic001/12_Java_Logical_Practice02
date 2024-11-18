package PalindromeCheck;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println("enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String string = String.valueOf(num);
		String new_string ="";
		for(int i=string.length()-1; i>=0; i--) {
			new_string = new_string +string.charAt(i);
		}
		
		Integer innum = Integer.valueOf(new_string);
		if(num==innum) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
	}
}
