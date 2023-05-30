package RunnableInterface;

public class FlipKartPaytmMain {
	public static void main(String[] args) {

		Flipkart f=new Flipkart();
		Thread ft=new Thread(f);
		
		
		Paytm p=new Paytm();
		Thread pt=new Thread(p);
		
		
		pt.start();
		ft.start();
		
		
		
		
		
	}
}
