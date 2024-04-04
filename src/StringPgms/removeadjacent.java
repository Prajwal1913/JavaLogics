package Programmingmock;

import java.util.Arrays;

public class removeadjacent {
public static void main(String[] args) {
	String str = "Bengaluru Bengaluru Bengaluru is Bengaluru Bengaluru my city. ";
	String[]  s1 = str.split(" ");
	System.out.println(Arrays.toString(s1));
	for (int i = 0; i < s1.length-1; i++) {
		boolean result = removeAdj(s1[i] , s1[i+1]);
		if(!result){
			System.out.print(s1[i]+" ");
		}
	}
	System.out.println(s1[s1.length-1]+" ");
}
static boolean removeAdj(String str1, String str2){
	if(str1.length()!=str2.length()){
		return false;
	}
	for (int i = 0; i < str1.length(); i++) {
		if(str1.charAt(i)!=str2.charAt(i))
			return false;
	}
	return true;
}
}