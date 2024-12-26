package lone;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num1");
		int x=s.nextInt();
		System.out.println("Enter num2");
		int y=s.nextInt();
		int c=x+y;
		System.out.println("Addition of two number is "+c);
	}

}
