//Program 4
/*Steeve is currently working in a job portal. His mode of work is, store the registration details like name, qualification, age, phone number, email id and no of years of experience if any of a job seeker. The system will register all the details given and save it in the portal. Implement the scenario and display the output as shown in the sample.

Sample Input 1:
Enter your name:Steeve
Enter your age:24
Enter your phoneno:9876542100
Enter your qualification:MBA
Enter your email id[Please provide valid id, after registering your registration id will be
mailed]:Steeve@gmail.com
Enter your noofexperience[if any]:1.5


Sample Output 1:

Dear Steeve, Thanks for registering in our portal, registration id will be mailed to Steeve@gmail.com within 2 working days*/

import java.util.*;

public class Prog_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your phone no: ");
		long no = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter ur mail:");
		String mail = sc.nextLine();
		System.out.println("Dear " + name + ". Thanks for registering in our portal, registration id will be mailed to " + mail + " within 2 working days");
		
	}
}
