package StringWordCount;

import java.util.Scanner;

// string count here shubhi singh
// it called character count;
public class StringCountP {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String here for string count ");
		String s = sc.nextLine();
		int count = 0;
		
		for(int i = s.length(); i>0; i--) {
			count++;
		}
		
		System.out.println(count);
	}

}
