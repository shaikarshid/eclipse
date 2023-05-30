package SingleTonClass;

public class PmMain {

	public static void main(String[] args) {

		PrimeMinister pm =PrimeMinister.instace();
		
		System.out.println(pm.age);
		System.out.println(pm.name);
		
		PrimeMinister.instace();
		
		PrimeMinister.instace();
	}
}
