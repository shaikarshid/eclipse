package RunnableInterface;

public class AmazonMain {
	public static void main(String[] args) {
		
		Amazon a=new Amazon();
		Thread t=new Thread(a);
		t.start();




	}
}
