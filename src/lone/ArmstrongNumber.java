package lone;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/* num=153= 1*3 +5*3+3*3 number of every cube total is 153 1+125+27=153
		 
		 9474= 9*4+4*4+7*4+4*4 =6561+256+2401+256
		*/
		
		int number = 153, temp, remainder, result = 0;

        temp = number;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp = temp/10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
