/*Compute Gain Percentage


Vikram buys an old scooter for Rs. A and spends Rs. B on its repairs. If he sells the scooter for Rs. C , What is the gain %?  


    If old price or sold price results in zero or negative or repair price is negative, then display "Incorrect Inputs"    

  2. If  Selling price is not greater than Price of  [old scooter + Repaired amount]  display  "Unable to calculate Gain Percentage" .  


Refer the samples for read and display the data. The Gain percentage should be displayed with 2 decimal digits.


Sample Input 1:
Price of old scooter:
4700
The amount spent for repair:
800
Sold Price:
5800

Sample Output 1:
Gain percentage is 5.45*/
import java.util.*;

public class Prog_8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Price of old scooter:");
		int price = sc.nextInt();
		System.out.println("The amount spent for repair:");
		int repair = sc.nextInt();
		System.out.println("Sold Price:");
		int sold = sc.nextInt();
		float gp = (sold/(repair+price));
		System.out.println("Gain percentage is " + gp);

	}
}
