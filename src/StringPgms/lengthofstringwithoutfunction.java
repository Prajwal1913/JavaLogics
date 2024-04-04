package StringPgms;

public class lengthofstringwithoutfunction {
	public static void main(String[] args) {
		String str ="language";
		char[] ch = str.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		System.out.println(count);
	}
}
