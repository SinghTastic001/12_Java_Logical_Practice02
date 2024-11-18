package PalindromeCheck;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		System.out.println("Enter a string here ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		
		String new_string = "";
		
		for(int i=string.length()-1; i>=0; i--) {
			
			new_string = new_string + string.charAt(i);
		}
		
		if(new_string.equals(string)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrom");
		}
		
		
	}

}
