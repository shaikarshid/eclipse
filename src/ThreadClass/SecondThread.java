package ThreadClass;
//By Extending ThreadClass -.> ex:1
public class SecondThread extends Thread
{
   public void run()
   {
	   for(int j=0;j<=5;j++)
	   {
		   System.out.println("j"+j);
		   try {
		   Thread.sleep(2000);
		   }
		   catch (Exception e) {
			   e.printStackTrace();
		}
		   
	   }
   }
}
