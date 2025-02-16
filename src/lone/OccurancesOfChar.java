package lone;

public class OccurancesOfChar {

	public static void main(String[] args) {
		
		String str="JavaProgram";
		
		char ch='g';
		int count=0;
		
		for(char c:str.toCharArray()) {
			if(ch==c)
				count++;
		}
System.out.println("count of char is "+count);
	

	String str1="L o ne s a n to s h";
	String result=str1.replaceAll("\\s+","");//\s for space
	System.out.println(result);
}
}