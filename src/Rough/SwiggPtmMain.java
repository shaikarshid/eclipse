package Rough;

public class SwiggPtmMain {
	public static void main(String[] args) {
		
		Swiggy s=new Swiggy();
		
		Paytm p=new Paytm();
		Thread p1=new Thread(p);
		
		
		s.start();
		p1.start();
	}

}
