package SingleTonClass;

public class PrimeMinister 
{ 
	
	String name="modi";
	int age=72;
	
	private static PrimeMinister  pm;
	
	private PrimeMinister()
	{
		System.out.println(" pm seleceted");
	}
	
	public static PrimeMinister instace()
	{
		if(pm == null)
		{
			pm=new PrimeMinister();
		}
		else
		{
			System.out.println(" pm already elected");
		}
		return pm;
	}

}
