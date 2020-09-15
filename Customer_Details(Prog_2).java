//Program 2
/*Help Mr.Ben who is a programmer, in developing a registration form on console. Customers will not just input data, but also view the details once he/she finishes the registration. 

Sample Input 1:

Enter your name:Jany

Enter age:25

Enter gender:Female

Hailing from:Mexico


Sample Output 1:

Welcome, Jany!

Age:25

Gender:Female

City:Mexico*/

import java.util.*;

public class Prog_2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Gender:");
		String gender = sc.nextLine();
		System.out.println("Hailing from:");
		String loc = sc.nextLine();
		
		System.out.println("Welcome, " + name + "!\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "City: " + loc); 
	}
}
