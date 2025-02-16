package lone;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,9,3,7,2,7,4,11,6};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("Array elements "+set);
	}

}
