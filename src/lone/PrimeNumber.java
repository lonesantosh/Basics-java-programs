package lone;

public class PrimeNumber {

	public static void main(String[] args) {

		// number which is divisible by only 1 and itself it's called prime number 5=1,5 only
		
		int num = 11;
		boolean flag = false;
		// 0 & 1 are not a prime number
		if (num == 0 || num == 1) 
		{
			flag = true;
		}
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(num + " is a prime a number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

}
