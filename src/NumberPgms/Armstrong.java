package Armstrong;

public class Armstrong 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=153; i++)
		{
		int no = i;
		int no1 = no;
		int copy = no;
		int count =0;
		int sum=0;
		
			while(no1!=0)
			{
				no1=no1/10;
				count++;
			}
			while(no!=0)
			{
				int rem=no%10;
				sum = sum + (int)Math.pow(rem, count);
				no = no/10;
			}
			if(copy==sum)
			{
				System.out.println("Armstrong number " +copy);
			}
		}
	}
}
