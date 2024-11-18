package MinAndMaxArray;

public class MaxArray {

	public static void main(String[] args) {
		
		int[] arr = {10,300,40,600,80,90};
		int num = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>num) {
				num = arr[i];
			}
		}
		
		System.out.println(num);
	}
}
