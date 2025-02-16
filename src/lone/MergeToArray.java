package lone;

import java.util.Arrays;

public class MergeToArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,8,3,5};
		int arr2[]= {6,2,4,9,10,14};
		
		int marge[]=new int[arr1.length+arr2.length];

			System.arraycopy(arr1, 0, marge, 0, arr1.length);
			System.arraycopy(arr2, 0, marge, arr1.length, arr2.length);
			
		System.out.println("Merge array data "+Arrays.toString(marge));
	}

}
