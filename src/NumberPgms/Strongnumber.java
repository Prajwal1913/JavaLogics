package NumberPgms;

public class Strongnumber {
public static void main(String[] args) {
	int no=145;
	int copy=no;
	int sum=0;
	while(no!=0){
		int rem = no%10;
		int fact=1;
		for(int i=rem ;i>=1;i--){
			fact=fact*i;
		}
		sum=sum+fact;
		no=no/10;
	}
	if(copy==no){
		System.out.println("Strong number");
	}else{
		System.out.println("Not a Strong Number");
	}
}
}
