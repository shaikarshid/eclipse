package InstanceOf;

class Father                        
{
	int x=20;                              

}
class Son extends Father
{
	int y=30;
}
class Daughter extends Father
{
	int z=40;
}
public class Solution{
	public static void main(String[] args) {
		
		Father f=new Father();
		Son s=new Son();
		Daughter d= new Daughter();
	
		
	/** instanceOf is used to cheak the "An Object having the properties of a Class or Not" */
		
		System.out.println(f instanceof Son);
		System.out.println( f instanceof Daughter);
		
		System.out.println(s instanceof Father );
		System.out.println(d instanceof Father);
		

	
	
		
	}
}