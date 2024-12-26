package lone;

public class Palindrome {

	public static void main(String[] args) {
		
		// reading is same called Palindrome 121, 525
		
		int num=525 , rev=0;
		int temp,remainder;
		
		temp=num;
		while(temp!=0) {
			remainder=temp%10;
			rev=rev *10+remainder;
			temp=temp/10;
		}
		if(num==rev)
			System.out.println("Given number "+num+" is palindrome");
		else
			System.out.println("Given number "+num+" is not a palindrome");
	}

}
