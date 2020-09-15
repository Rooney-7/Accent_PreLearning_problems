/*Movie Ticket Calculation


In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the king class ticket is Rs.75 and queen class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.
Hint: k-king and q-queen and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display "Minimum of 5 and Maximum of 40 Tickets".  If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k

Sample Output 1:
Ticket cost:4065.25*/
import java.util.*;

public class Prog_7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of ticket:");
		int no = sc.nextInt();
		if(no <5 || no >40)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			System.exit(0);
		}
		sc.nextLine();
		System.out.println("Do you want refreshment:");
		char ref = sc.next().charAt(0);
		System.out.println("Do you have coupon code:");
		char cou = sc.next().charAt(0);
		System.out.println("Enter the circle:");
		char circle = sc.next().charAt(0);
		if(!(circle == 'k'))//|| circle != "q")
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}

		double ticket_cost =0.0;
		if( circle == 'k')
		{
			ticket_cost = (no * 75);

		}
		else
		{
			ticket_cost=(no*150);
		}
		if(no > 20)
		{
			ticket_cost = ticket_cost * 0.90;
		}
		if(cou == 'y')
		{
			ticket_cost = ticket_cost * 0.98;
		}
		if(ref == 'y')
		{
			ticket_cost = ticket_cost + (no * 50);
		}
		System.out.println("Ticket cost:" + String.format("%.2f",ticket_cost));

	}
}
