package Logics;

import java.util.Scanner;

public class Leapyear {
public static void main(String[] args) {
	System.out.println("enter the year :");
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	System.out.println(leapyear(year));
}
static int leapyear(int year){
	if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
		return 1;
	}else{
		return 0;
	}
}
}
