package StringWordCount;

import java.util.Scanner;

// string count like word i am shubhi singh  count is 
public class StringCountP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enteer a string here for string coount ");
		
		String string = sc.nextLine();
		String[] ar_str = string.split(" ");
		
		int count = 0;
		
//		for(int i = ar_str.length; i>0; i--) {
//			count++;
//		}
//		System.out.println(count);
		
		
		for(String s : ar_str) {
			count++;
		}
		System.out.println(count);
	}
}
