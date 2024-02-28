package learningjava;

import java.util.Scanner;

public class UserInput {

	public static void main(String args[])
{
	System.out.println("Please Input the Age");
	Scanner input = new Scanner(System.in);
	int Age=input.nextInt();
	System.out.println(Age);
	input.close();

}
	
}
