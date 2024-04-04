package StringPgms;

import java.util.Arrays;

public class removeAdjecentwords {
public static void main(String[] args) {
//	String str = "hi hi how how are are you you";
	String str = "Bengaluru Bengaluru Bengaluru is Bengaluru Bengaluru my city ";
	String[] str1 = str.split(" ");
	System.out.println(Arrays.toString(str1));
	for (int i = 0; i < str1.length-1; i++) {
		boolean result = removeAdjecent(str1[i] , str1[i+1]);
		if(!result){
			System.out.print(str1[i]+" ");
		}
	}
	System.out.println(str1[str1.length-1]);
}
static boolean removeAdjecent(String s1, String s2){
	if(s1.length()!=s2.length()){
		return false;
	}
	for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)!=s2.charAt(i))
			return false;
	}
	return true;
	}
}
