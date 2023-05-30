package SingleTonClass;

public class AccounMain {
	public static void main(String[] args) {
		
		Account a=Account.getInstance();
		System.out.println(a.accName);
		System.out.println(a.accNum);
		
		
		Account.getInstance();
	}

}
