package Programmingmock;

public class uniquechar {
public static void main(String[] args) {
	String str ="java";
	char[] ch = str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		boolean flag = true;
		for (int j = 0; j < ch.length; j++) {
			if(ch[i]==ch[j]&&i!=j){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.print(ch[i]+"");
		}
	}
}
}
