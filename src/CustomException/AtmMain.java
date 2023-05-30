package CustomException;

import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int amount=500;
		System.out.println("  avalible amount  "+ amount );
		System.out.println(" enter the withdraw amount ");
		int withdraw=ip.nextInt();
		if(amount>=withdraw)
		{
			System.out.println(withdraw+" withdraw amount sucessfully");
			amount=amount -withdraw;
			System.out.println(" remaining balance : "+ amount);
		}
		else
		{
			try
			{
				throw new AtmException(" insufficient balance");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}
}
