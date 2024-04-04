package Arrays;

public class Factorialofarray {
	public static void main(String[] args) 
	{
		
		int[] arr={12,3,14};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>10)
				{			
					fact(arr[i]);
				}
				
		}
			
	}
	static void fact(int a)
	{
		long fact =1;
		for(int j=a; j>=1;j--)
					{
						fact=fact*j;
						
					}
					System.out.println(fact+ " ");
	}
}