package lone;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234,rev=0,remainder;
		
		while(num!=0) {
			remainder=num%10;
			rev=rev *10+remainder;
			num=num/10;
		}
		System.out.println("Reverse number is "+rev);
	}

/*		power of any number given
		int base=2,expo=3;
		double result=Math.pow(base, expo);
		System.out.println(base+" power is "+result);
		*/
		
	
}
