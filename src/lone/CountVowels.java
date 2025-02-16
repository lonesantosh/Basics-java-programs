package lone;

public class CountVowels {

	public static void main(String[] args) {
		
		String str="Lone";
		int vowel=0,constanant=0;
		
		for(char c:str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowel++;
			}else if (Character.isLetter(c)) {
				constanant++;
			}
		}
System.out.println("Vowel "+vowel+" Constanat "+constanant);
	}
}