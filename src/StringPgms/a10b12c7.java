package StringPgms;

import java.util.Arrays;

public class a10b12c7 {
public static void main(String[] args) {
	String str ="A10B12C7";
	
	String s1 = str.replaceAll("[0-9]", "");
	String s2 = str.replaceAll("[a-zA-Z]"," ");
	
	String[] str1 = s1.split("");
	String[] str2 = s2.split(" ");
	
	System.out.println(Arrays.toString(str1));
	System.out.println(Arrays.toString(str2));

	for (int i = 1; i < str2.length; i++) {
		int no = Integer.parseInt(str2[i]);
		printing(no,str1[i-1]);
	}
}
    static void printing(int no, String string)
    {
    	for (int i = 0; i <= no; i++)
		{
			System.out.print(string);
		}
    }
//	String str ="a10b12c7";
//	for (int i = 0; i < str.length(); i++) {
//		char ch =str.charAt(i);
//		if(ch=='a'){
//			for (int j = 0; j <10 ; j++) {
//				System.out.print("a");
//			}
//		}else if(ch=='b'){
//				for (int k = 0; k <12; k++) {
//					System.out.print("b");
//			}
//		}else if(ch=='c'){
//					for (int l = 0; l <7; l++) {
//						System.out.print("c");
//					}
//				}
//			}
}
























