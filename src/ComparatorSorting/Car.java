package ComparatorSorting;

public class Car
{
	Integer id;
	String name;
	Double cost;
	
	Car(Integer id,String name,double cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return  "id :"+id+" name "+name+" cost "+cost;
		
	}
	
	

}
