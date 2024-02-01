import java.util.*;
class userThread extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("userThread is Excuting");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Something went wrong..");
			}
			
		}
		System.out.println("userThread is completed");
	}
}
class daemonThread extends Thread
{
	public void run()
	{
		for( ; ; )
		{
			System.out.println("daemonThread is Excuting");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Something went wrong..");
			}
			
		}
	}
}
public class userThreadDaemonThread {

	public static void main(String[]args) throws Exception{
		System.out.println("Main() started excution");
		userThread ut = new userThread();
		daemonThread dt = new daemonThread();
		// to create Daemon thread 
		dt.setDaemon(true);
		ut.start();
		dt.start();
		System.out.println("Main() completed excution");
	}

}
