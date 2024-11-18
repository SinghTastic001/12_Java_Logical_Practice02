package SearchElements;

public class SearchElements {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,50,40,70,80,90};
		int num = 700;
		
		boolean flag = false;
		for(int i=0; i<array.length; i++) {
			if(array[i]==num) {
				System.out.println("number is present inside array "+num);
				flag = true;
			}
			
		}
		
		if(flag==false) {
			System.out.println("number is not present inside array");
		}
	}

}
