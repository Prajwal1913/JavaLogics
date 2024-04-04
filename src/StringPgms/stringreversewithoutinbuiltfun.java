package StringPgms;

public class stringreversewithoutinbuiltfun {
public static void main(String[] args) {
	String str = "hi how are you ";
	String[]  s1 = new String[5];
	String str2=" ";
	int j=0;
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(ch!=' '){
			str2 = str2+ch;
		}else{
			s1[j] =str2;
			j++;
			str2=" ";
		}
	}
	for (int  i = s1.length-1;i>=0; i--) {
		if(s1[i]!=null)
			System.out.print(s1[i]+" ");
	}
}
}
