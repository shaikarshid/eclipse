package RunnableInterface;

public class Flipkart implements Runnable
{

	@Override
	public void run()
	{
		// payment ayyaka 2 min travtaha order sucefful ani mgs vastadhi anuke mundu pettanu try & catch block
		// ela cheyakudadu  synchronization keyword use chesi cheyalii...
		/**
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}*/
		
		System.out.println(" order sucessfull");
		
	}
}
