package KeySet;

public class Employee1  implements  Comparable <Employee1>  {

	Integer id;
	String name;
	Double marks;
	
	
	public Employee1(Integer id, String name, Double marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks ;
	}
	
	

	@Override
	public int compareTo(Employee1 e) {
		
		return this.name.compareTo(e.name);
	}

}
