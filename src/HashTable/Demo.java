package HashTable;

import java.util.Hashtable;

// HAshmap & HAshTable both are similar but hashMAp is  not thread safe & hashtable is thread safe
public class Demo 
{
	public static void main(String[] args) {
		Hashtable<Integer, String> t=new Hashtable<>();

		t.put(1, "one");
		t.put(2, "two");
		t.put(3, "three");

		t.put(4, "four");

		System.out.println(t);

		System.out.println(t.remove(4));
		System.out.println(t);

		System.out.println(t.get(3));
	}
}

//HAshmap & HAshTable both are similar
//but hashMAp is  not thread safe 
//hashtable is thread safe
/**
 * In hashmap key value store as null 
 * and in hashtable null cann't store as key */
