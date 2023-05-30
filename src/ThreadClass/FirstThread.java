package ThreadClass;
// By Extending ThreadClass -.> ex:1
public class FirstThread  extends Thread
{

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("i"+i);

			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e )
			{
				e.printStackTrace();
			}
		}

	}



}

