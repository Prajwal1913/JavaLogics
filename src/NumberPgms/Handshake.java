package Logics;
import java.util.*;
public class Handshake {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	int res = (num*(num-1))/2;
	System.out.println("Number of handshakes of "+num+" people is " +res);
}
}