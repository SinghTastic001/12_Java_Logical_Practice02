package PrimeCheck;

public class WhileUsing1 {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i<15) {
			int j=1;
			int count = 0;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				j++;
			}
			
			if(count==2) {
				System.out.println("prime no. "+i);
			}
			i++;
		}
	}

}
