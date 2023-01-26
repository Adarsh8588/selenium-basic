package java_programs;

public class Countwords2 {

	public static void main(String[] args) {
		String s = "kavya";
		String s1 = s.toLowerCase();
		int K = 0, A = 0, V = 0, Y = 0;

		for (int j = 0; j < s1.length(); j++) {
			char ch=s1.charAt(j);
			if (ch=='k') {
				K++;
			} else if(ch=='a') {
				A++;
			}
			else if(ch=='v') {
				V++;
			}
			else if(ch=='y') {
				Y++;
			}
		}
		
		System.out.println("k"+" occurd "+K+"  times");
		System.out.println("a"+" occurd "+A+"  times");
		System.out.println("v"+" occurd "+V+"  times");
		System.out.println("y"+" occurd "+Y+"  times");

	}
}
