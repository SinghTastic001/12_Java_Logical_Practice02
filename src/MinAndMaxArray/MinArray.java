package MinAndMaxArray;

public class MinArray {

	public static void main(String[] args) {
		
		int[] ar = {10,40,60,5,100};
		int num = ar[0];
		
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]<num) {
				num = ar[i];
			}
		}
		System.out.println(num);
	}
}
