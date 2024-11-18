package PrimeCheck;

public class second {

	public static void main(String[] args) {
		
		int primeCount = 20;
		int count = 0;
		int i=1;
		
		while(count<=primeCount) {
			
			int count1 = 0;
			
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count1++;
				}
				
			}
			if(count1==2) {
				System.out.println(i);
				count++;
			}
			
			i++;
		}
	}
}
