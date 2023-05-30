package cheakException;
//throws// cheakException
public class Demo1 {


	static void display() throws Exception
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(2500);  // ekkada exception chupistadhii...
		}
	}
	public static void main(String[] args)
	{
		try {
			display();
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}
}
