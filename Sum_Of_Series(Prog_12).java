/*Sum of the series

Write a Program to print the sum of the following series.

SUM = -X + X2 - X3 + X4 - X5+ ... n terms

Prompt the user to enter the first number and the nth term.

 Both the input numbers  should be  positive, else  print as “Invalid Input”

Display the result along with the message, “The sum of the series is a positive number” or “The sum of the series is a negative number”

[Note: The sign of the alternate number changes.]


Sample input 1

Enter the first number

45

Enter the nth number

8

Sample output 1

-45+46-47+48-49+50-51+52=4

The sum of the series is a positive number

*/
import java.util.*;

public class Prog_12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int no1 = sc.nextInt();
		System.out.println("Enter the nth no:");
		int no2 = sc.nextInt();
		int temp=0;
		for(int i=0;i<no2;i++)
		{
			if(i % 2 ==0)
			{
				temp = -1 * no1;
			}
			System.out.println(temp);
			no1++;
			temp = no1;
		}

	}
}
