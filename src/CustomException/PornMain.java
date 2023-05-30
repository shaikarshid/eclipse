package CustomException;

import java.util.Scanner;

public class PornMain
{
	public static void main(String[] args) {
		
		 Scanner  ip=new Scanner(System.in);
		 
		 System.out.println(" enter the age");
		 int age=ip.nextInt();
		 
		 if(age>=21)
		 {
			 System.out.println("  enjoy ");
		 }
		 else
		 {
			 try
			 {
				 throw new pornHub(" u r kid stay aways  from this website ");
			 }
			 catch (Exception e) {
			System.out.println(e.getMessage());
			}
		 }
		
	}

}
