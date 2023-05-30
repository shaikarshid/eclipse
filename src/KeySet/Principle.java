package KeySet;

public class Principle {
	Integer id;
	String name;
	Double rank;


	Principle(Integer id, String name, Double rank) {

		this.id = id;
		this.name = name;
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", rank=" + rank ;
	}
	
	

//	SortId
//	SortName   
//	SortRank
	

}
