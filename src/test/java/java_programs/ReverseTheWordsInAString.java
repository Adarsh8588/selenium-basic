package java_programs;

public class ReverseTheWordsInAString {

	public static void main(String[] args) {
		String s="i am in ooty";
		String s1 = s.substring(1);
		System.out.println(s1);
		
		String[] str = s1.split(" ");
		String s2="";
		for (int i = 0; i < str.length; i++) {
			String sub="";
			for (int j = str[i].length()-1; j >=0 ; j--) {
				sub=sub+str[i].charAt(j);
			}
			s2=s2+sub+" ";
		}
		System.out.println(s2);
	}
}
