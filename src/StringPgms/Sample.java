package Logics;

public class Sample {
		public static void main(String[] args){
		String str="java is programming language and it is easy";
		String [] arr = str.split(" ");
		int n = arr.length-1;
		for(int i=0; i<arr.length;i++){
			if(i<4){
		System.out.print(arr[i]+" ");
			}
			else{
				System.out.print(arr[n--]+" ");
			}
		}
		}
}
