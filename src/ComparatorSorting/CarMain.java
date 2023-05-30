package ComparatorSorting;

import java.util.TreeSet;

public class CarMain
{
	public static void main(String[] args) {
		
		Car c1=new Car(1, "a", 2.0);
		Car c2=new Car(2, "b", 3.0);
		Car c3=new Car(3, "c", 1.0);
		
		//Sorting Class ku Object Creat Karna....
		
		SortingBYCost cost=new SortingBYCost();
		SortingById id=new SortingById();
		SortingByNAme name= new SortingByNAme();
		
		TreeSet<Car> t=new TreeSet(name);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car i:t)
		{
			System.out.println(i);
		}
		
		
	}

}
