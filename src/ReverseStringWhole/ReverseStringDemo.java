package ReverseStringWhole;

import java.util.Scanner;

public class ReverseStringDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String here ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] ar = string.split(" ");
		
		String new_string = "";
		
		for(String i:ar) {
			
			for(int j=i.length()-1; j>=0; j--) {
				
				new_string = new_string + i.charAt(j);
			}
			new_string = new_string +" ";
		}
		
		System.out.println(new_string);
		
		
	}

}
