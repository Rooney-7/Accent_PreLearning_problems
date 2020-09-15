/*Clearance Sale
As the winter season is nearing Nyx Air Coolers has decided to go for a clearance sale for 4 days.
The number of items and the price for each item is displayed on the board. The price of the unsold items will be reduced by 7% on each day. For example if an item price is Rs.10000 on the first day, then it will cost Rs.9300 for the next day. Again if the items are unsold on the third day then the price goes to Rs.8649 which is 7% of 9300.
Design a program that prompts the user for the name of the item, number of items for sale , number of items sold on each day . Display the name of the item, Price of the item on each day and the number of items available for sale.  Also display the Total amount obtained through the clearance sale.

Note : For price and any amount calculation, use the data type as double and when printing the values, use System.out.printf method.

Example : totalSales = 145428.70
System.out.printf("Total amount of Sales = Rs.%.0f",totalSales);

Sample input 1:
Enter the name of the Item:
Symphony Winter 56 L Air Cooler
Enter the price of the item:
10000
Enter the number of items for sale:
10
Enter the number of items sold on Day1:
4
Enter the number of items sold on Day2:
3
Enter the number of items sold on Day3:
2
Enter the number of items sold on Day4:
1

Sample output 1:

Symphony Winter 56 L Air Cooler
Day No.of items_available Price
Day1 10 10000
Day2 6 9300
Day3 3 8649
Day4 1 8043
Total amount of Sales = Rs.93241*/
import java.util.*;

public class Prog_10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Item:");
		String name = sc.nextLine();
		System.out.println("Enter the price of the item:");
		double price = sc.nextInt();
		System.out.println("Enter the number of items for sale:");
		int no = sc.nextInt();

		int left[] = new int[5];
		left[0] = no;
		for(int i=1;i<5;i++)
		{
			System.out.println("Enter the no of items sold on Day " + (i+1) + ":");
			int sold = sc.nextInt();
			left[i] = left[i-1] - sold;
			if(left[i] == 0)
			{
				break;
			}
		}

		double total=0;
		System.out.println(name);
		System.out.println("Day  No.ofitemsavailable Price");
		System.out.println("Day " + (1) + left[0] + price);
		total = price * left[0];
		for(int i=1;i<5;i++)
		{
			if(left[i] == 0)break;
			price = price * 0.93;
			total = total + left[i] * price;
			System.out.println("Day " + (i+1) +" "+ left[i] +" "+ price);
		
		}
		System.out.println("Total Price = " + String.format("%.0f",total));


	}
}
