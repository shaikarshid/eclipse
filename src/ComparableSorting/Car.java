package ComparableSorting;

public class Car implements Comparable<Car>
{
	int cost;
	String name;

	Car(int cost,String name)
	{
		this.cost=cost;
		this.name=name;

	}
	@Override
	public String toString()
	{
		return "cost "+cost+" name:"+name;
	}
	
	@Override
	public int compareTo(Car c)
	{
//		return this.cost-c.cost;       //asscending Order
//		return this.name.compareTo(c.name);//asscending Order
		
		return c.cost-this.cost;  ////Decending Order
//		return c.name.compareTo(this.name);//Decending Order
	}


}
//ONly one Sorting either cost or name