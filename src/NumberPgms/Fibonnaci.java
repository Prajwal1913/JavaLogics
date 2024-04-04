package Logics;
import java.util.*;
public class Fibonnaci {
public static void main(String[] args)
{
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of x : ");
	int x= sc.nextInt();*/
	int fib1=0;
	int fib2=1;
	int fib3=0;
	
	for(int i=0;i<=10;i++)
	{
		fib3 = fib1+fib2;
		System.out.println(fib3+ " ");
		fib1 = fib2;
		fib2 = fib3;
	}
}
}