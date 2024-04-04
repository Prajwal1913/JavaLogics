package Logics;

public class happunum {
public static void main(String[] args) {
	int no=45;
	while(no>9){
		no=numberSum(no);
	}
	if(no==1||no==7){
		System.out.println("Happy number");
	}else{
		System.out.println("Not happy number");
	}
}
static int numberSum(int no){
	int sum=0;
	while(no!=0){
		int rem =no%10;
		sum=sum+rem*rem;
		no=no/10;
	}
	return sum;
}
}
