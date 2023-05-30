package ComparableSorting;

import java.util.TreeSet;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car(9,"a");
		Car c1=new Car(8,"b");


		TreeSet<Car> t=new TreeSet();

		t.add(c1);
		t.add(c);

		for(Car i: t)
		{
			System.out.println(i);
		}


	}
}
