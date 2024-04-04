package ArraysPgms;

import java.util.Scanner;

public class dynamicarraycreation {
public static void main(String[] args) {
	int[] akk= inputArray();
	printArray(akk);
}
static int[] inputArray(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size :");
	int size=sc.nextInt();
	int[] arr= new int[size];
	System.out.println("enter the index value");
	for (int i = 0; i < arr.length; i++) {
		
		arr[i]=sc.nextInt();
	}
	return arr;
}
static void printArray(int[] acc){
	for (int i = 0; i < acc.length; i++) {
		System.out.print(acc[i]+" ");
	}
}
}
