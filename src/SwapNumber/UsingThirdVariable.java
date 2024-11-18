package SwapNumber;

public class UsingThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		int c ;
		
		System.out.println("before swap "+a+" "+b);
		
		if(a!=b) {
			
			c = b;
			b = a;
			a = c;
			
			System.out.println("after swap "+a+" "+b);
		}
	}

}
