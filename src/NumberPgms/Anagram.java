package Logics;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="cat";
		String s2="act";
		if(s1.length()==s2.length())
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
//			boolean result = Arrays.equals(c1, c2);
			boolean result = equals(c1,c2);
			if(result){
				System.out.println("anagram");
			}else{
				System.out.println("not an anagram");
			}
		}
		else{
			System.out.println("not an anagram");
		}
	}
	static boolean equals(char[] a1, char[] a2){
		for(int i=0;i<a1.length;i++){
			if(a1[i]!=a2[i]){
				return false;
			}
		}
		return true;
	}
}
