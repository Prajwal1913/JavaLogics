package Logics;

public class reversestringwithoutbuiltinfunction {
	public static void main(String[] args) {
		String str = "java";
		char[] ch = str.toCharArray();
		int count =0;
		for (char c : ch) {
			count++;
		}
		reverse(ch,count-1);
	}
	static void reverse(char[] ch, int length){
		if(length>=0){
			System.out.print(ch[length]+ " ");
			reverse(ch,length-1);
		}
	}
}
