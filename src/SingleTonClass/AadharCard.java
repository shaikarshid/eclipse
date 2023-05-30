package SingleTonClass;

public class AadharCard 
{

	private static AadharCard a;


	public AadharCard()
	{
		System.out.println("aadhar card created");
	}


	public static void istance()
	{
		if(a==null) {
			a= new AadharCard();
		}
		else
		{
			System.out.println(" Aadharcard already created");
		}
	}
	
}




/**
 * 
 * Rules:
 *  1. static function
 *  2: private constructor
 *  3: private non primitive reference 
 * 
 * */
