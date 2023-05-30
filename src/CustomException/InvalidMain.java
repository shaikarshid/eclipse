package CustomException;

import java.util.Scanner;

public class InvalidMain {

	public static void main(String[] args) {


		Scanner ip=new Scanner(System.in);

		System.out.println(" enter the pasword");
		int password=ip.nextInt();

		if(password==112)
		{
			System.out.println(" login successfull");
		}
		else
		{
			try
			{
				throw new InvalidPasswordException(" plz enter correct password");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}
}