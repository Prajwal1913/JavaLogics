package Logics;

public class countprimenum10to70 {
public static void main(String[] args) {
	int count=0;
	for(int j=10;j<=70;j++)
	{
		int no=j;
		boolean flag = true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0){
				flag = false;
				break;
			}
		}
		if(flag==true){
			count++;
		}
	}
	System.out.println("count of prime numbers is " +count);
	if(count%2==0){
		System.out.println(count+ " is even number");
			int count1 = sum(count);
		System.out.println("sum of "+count+" is " +count1);
		happynum(count1);
	}
	else{
		System.out.println(count+ " is odd number");
			int count1 = sum(count);
		System.out.println("sum of "+count+" is " +count1);
		int fact = factorial(count1);
		System.out.println("factorial of " +count1+ " is " +fact);
	}
}
static int sum(int num){
	int sum=0;
	while(num!=0){
		int rem =num%10;
		sum = sum + rem;
		num=num/10;
	}
	return sum;
}


static int happynum(int a){
	while(a>9){
		int num=number(a);
	}
	if(a==1||a==7)
	{
		System.out.println(a+ " is a happy number");
	}else{
		System.out.println(a+ " is not a happy number");
	}
	return a;
}

static int number(int b){
	int sum=0;
	while(b!=0){
		int rem = b%10;
		sum = sum+rem*rem;
		b=b/10;
	}
	return sum;
}

static int factorial(int c){
	int fact=1;
	for (int i = c; i >=1; i--) {
		fact=fact*i;
	}
	return fact;
}
}