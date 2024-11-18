package SwapNumber;

public class WithoutUsingThirdVar {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		System.out.println("before swap "+a+" "+b);
//		if(a!=b) {
//			
//			a = a+b;
//			b = a-b;
//			a = a-b;
//			
//			System.out.println("after swap using add "+a+" "+b);		
//		}
		
		if(a!=b) {
			a = a*b;
			b = a/b;
			a = a/b;
			
			System.out.println("after swap using mul  "+a+" "+b);
		}
		
//		if(a!=b) {
//			a = a^b;
//			b = a^b;
//			a = a^b;
//			
//			System.out.println("after swap xor using "+a+" "+b);
//		}
	}
}
