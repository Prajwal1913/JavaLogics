package ArraysPgms;

public class Distinctelements {
	public static void main(String[] args) {
		int [] arr={1,2,3,3,4,5,5,6};
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]&&i!=j){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		char[] ch ={'a','b','b','c','d','d'};
		for (int i = 0; i < ch.length; i++) {
			boolean f = true;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]&&i!=j){
					f=false;
					break;
				}
			}
			if(f==true){
				System.out.print(ch[i]+" ");
			}
		}
	}
}
