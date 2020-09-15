/*Income Calculation


In a company named Micky software solution, many part-time employees are working for a pay of Rs. 100 per hour. Write a program to calculate the total amount an employee earns in a year by working part time. Consider employees should work all day in the year and year has 365 days.

Note : The hour should be a positive value less than or equal to 24, if fails display "Unable to calculate the earnings"

Sample Input 1:
Enter no of hours worked in a day:3

Sample Output 1:
Total income in a year:109500*/

import java.util.*;

public class Prog_6
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of hours worked in a day:");
		int day = sc.nextInt();
		if(day > 24 || day < 0)
		{
			System.out.println("Unable to calculate earnings");
			System.exit(0);
		}
		sc.nextLine();
		System.out.println("Total income in a year:");
		float income = day * 100 * 365;
		System.out.print(String.format("%.0f",income));

	}
}
