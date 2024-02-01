import java.util.*;
class threadinterface1 implements Runnable 
{
	public void run()
	{
		System.out.println("addition task is started..");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		int c= a+b;
		System.out.println("sum: "+c);
		System.out.println("addition task is completed..");
	}
	
}
class threadinterface2 implements Runnable
{
	public void run()
	{
		System.out.println("Character printing task is started..");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try 
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Character printing task is completed..");
	}
}
class threadinterface3 implements Runnable
{
	public void run()
	{
		System.out.println("printing number task is started..");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("printing number task is completed..");
	}
}
public class implementingRunnableInterface {

	public static void main(String[] args) {
		threadinterface1 r1 =new threadinterface1();
		threadinterface2 r2 =new threadinterface2();
		threadinterface3 r3 =new threadinterface3();
		
		Thread t1 =new Thread(r1);
		Thread t2 =new Thread(r2);
		Thread t3 =new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
