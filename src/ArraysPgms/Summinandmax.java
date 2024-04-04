package Logics;

import java.util.Arrays;

public class Summinandmax {
public static void main(String[] args) {
	int[] arr={8,6,3,9,5,1,7,4,2,10};
	Arrays.sort(arr);
	System.out.println(arr[0]+arr[arr.length-1]);
}
}
