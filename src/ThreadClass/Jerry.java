package ThreadClass;
//By Extending ThreadClass -.> ex:2
public class Jerry  extends Thread {
	public void run() {
		for(int j=1;j<=20;j++)
		{
			System.out.println("j:"+j);
			if(j==10)
			{
				Thread.yield();
			}
		}

	}
}
