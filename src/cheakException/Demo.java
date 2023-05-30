package cheakException;
 // throws// cheakException
public class Demo  {

	static  void test() throws Exception
	{
		System.out.println(10/0);
	}

	public static void main(String[] args) {

	
		try {
			test();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("//OR\n divided avvadu");
		}

	}
}
//throws is used to indicate the caller about the posibility of an exception...