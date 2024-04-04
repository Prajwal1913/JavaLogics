package Arrays;

public class Mock {
	public static void main(String[] args)
	{
		SharedResource sr = new SharedResource();
		Sample1 s1 = new Sample1(sr);
		Thread th1 = new Thread(s1);
		th1.start();
		Demo d1 = new Demo(sr);
		Thread th2 = new Thread(d1);
		th2.start();
	}
}
class SharedResource
{
	synchronized void res1()
	{
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	synchronized void res2()
	{
		for(int i=101;i<=110;i++){
			System.out.println(i);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Sample1 extends Thread
{
	SharedResource sr1;
	Sample1(SharedResource sr1){
		this.sr1 = sr1;
	}
	public void run()
	{
		sr1.res1();
	}
}
class Demo extends Thread
{
	SharedResource sr2;
	Demo(SharedResource sr2){
		this.sr2 = sr2;
	}
	public void run()
	{
		sr2.res2();
	}
}

