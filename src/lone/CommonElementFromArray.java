package lone;

import java.util.HashSet;

public class CommonElementFromArray {

	public static void main(String[] args) {
		
		int arr1[]= {2,8,3,7,4};
		int arr2[]= {3,9,6,2};
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int num:arr1) {
			set.add(num);
		}
		
		for(int num:arr2) {
			if(set.contains(num)) {
				System.out.println("common element from array is "+num);
			}
				
		}	
	}

}
