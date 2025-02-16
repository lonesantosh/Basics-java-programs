package lone;

public class LargestInArray {

	public static void main(String[] args) {
		
		int arr[]= {2,5,9,3,7,8};
		int largest=arr[0];
		
		for(int num:arr) {
			if(num>largest)
				largest=num;
		}
		System.out.println("Largest number from array is "+largest);
			
	}
	

}
