package SumNumber;

import java.util.Scanner;

// 1234
public class SumNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int temp = number;
		int sum = 0;

		while(temp > 0) {

			int r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
		}

		System.out.println(sum);
	}

}
