package java_programs;

import java.util.LinkedHashSet;

public class Countwords {

	public static void main(String[] args) {
		String s = "kavya";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);

		for (Character lv : set) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (lv == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(lv + "   occred " + count + "  times");
		}
	}
}
