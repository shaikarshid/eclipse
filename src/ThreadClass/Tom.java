package ThreadClass;
//By Extending ThreadClass -.> ex:2
public class Tom  extends Thread {
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("t:"+i);
			if(i==5)
			{
				stop();
			}
		}
	}

}
