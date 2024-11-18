package StringWordCount;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		String[] ar = string.split(" ");
		int count = 0;
		
		for(String i : ar) {
			count++;
		}
		System.out.println(count);
	}
}
