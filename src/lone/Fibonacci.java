package lone;

public class Fibonacci {

	public static void main(String[] args) {
		
			int n=10, num1=0,num2=1;
			// Fibonacci Series mean add of previous and next num  0,1,2,3,4,5,6,7 
			//output=0, 1, 1, 2, 3, 5, 8, 13, 21, 34
			System.out.print("Fibonacci Series: " + num1 + ", " + num2);
			
			for (int i = 2; i < n; i++) {
				 int num3 = num1 + num2;
				 System.out.print(", " + num3);
				 num1 = num2;
				 num2 = num3;
				 }
		
	}

}
