package java_programs;

public class ReverseOfLettersAsOriginal {

	public static void main(String[] args) {
		String s1="i am adarsh";
		String[] str = s1.split(" ");
		int size[] = new int[str.length];
		String s2="";
		for (int i = 0; i < str.length; i++) {
			size[i]=str[i].length();
			s2=s2+str[i];
		}
		System.out.println(s2);//iamadarsh
		String s3="";
		for (int i = s2.length()-1; i >=0; i--) {
			s3=s3+s2.charAt(i);
		}
		System.out.println(s3);//hsradamai
		
		int k=0;
		String s4="";
		for (int i = 0; i < size.length; i++) {
			int n=size[i];
			
			while(n>0)
			{
				s4=s4+s3.charAt(k);
				n--;
				k++;	
			}
			s4=s4+" ";
		}
		System.out.println(s4);//h sr adamai 

	}
}
