package PrimeCheck;

public class PrimeCheck1 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=15; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("prime number is "+i);
			}
		}
	}
}
