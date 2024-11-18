package PrimeCheck;

public class SecondWay1 {

	public static void main(String[] args) {
		
		int primeCount = 0;
		int Prime = 10;
		int i = 1;
		
		while(primeCount<=Prime) {
			int j=1;
			int count = 0;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				j++;
			}
			
			if(count==2) {
				
				System.out.println("primeCount "+ i);
				primeCount++;
			}
			
			i++;
			
		}
		
	}
}
