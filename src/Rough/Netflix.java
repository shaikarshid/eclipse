package Rough;

public class Netflix  
{
	synchronized void  watchingMovie(String name,String movie)
	{
		System.out.println(name+" is watching "+ movie );
		
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(name+" is done watching  "+ movie);
	}
}
