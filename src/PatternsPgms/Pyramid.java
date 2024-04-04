package Pattern;

public class Pyramid {
	public static void main(String[] args) throws InterruptedException
	{
		for(int row=1;row<=5;row++){
			for(int col=5;col>=1;col--){
				if(row>=col)
				{
				Thread.sleep(30);
				System.out.print(" *");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}