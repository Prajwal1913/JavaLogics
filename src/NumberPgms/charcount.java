package Logics;

public class charcount {
public static void main(String[] args) {
	String s1 ="abdul kalam";
	char[] ch=s1.toCharArray();
	int cha=0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!=' '){
			cha++;
		}
	}
	System.out.println(cha);
}
}
