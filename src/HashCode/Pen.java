package HashCode;

public class Pen 
{
	int cost ;
	String name;
	
	Pen(int cost,String name)
	{
		this.cost=cost;
		this.name=name;
	}
	@Override
	public int hashCode()
	{
		return 1;
	}
	@Override
	public String toString()
	{
		return "name "+name+" cost"+cost;
	}
}
// hashCode will return the unique id to the object ..