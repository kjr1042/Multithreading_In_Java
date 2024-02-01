import java.util.*;
class thread1 extends Thread
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

class thread2 extends Thread
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

class thread3 extends Thread
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
public class extendingThreadClass {

	public static void main(String[] args) throws Exception {
		thread1 t1 =new thread1();
		thread2 t2 =new thread2();
		thread3 t3 =new thread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
