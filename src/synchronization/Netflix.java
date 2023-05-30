package synchronization;

public class Netflix {

	synchronized void watchingMovie(String name)
	{
		System.out.println(name+" watching movie ");
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(name+" is done watching movie");
	}
	
	
	
	
}
