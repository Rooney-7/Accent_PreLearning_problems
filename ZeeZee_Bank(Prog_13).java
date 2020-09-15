/*ZeeZee bank

ZeeZee bank maintains the account details for each customer. The account details are:

a.       Account number

b.      Type of account

c.       Balance amount

Consider the below class:


In the Account class include the given attributes methods and constructor with the access specifiers as specified in the class diagram.

The constructors are used to set the value and the getter methods are used to retrieve the value.

The withdraw method takes the amount to be withdrawn as argument. This method should check the balance and detect the withdrawn amount from the balance amount and return 1. If there is insufficient balance then return -1.

The deposit method takes the amount to be deposited as argument and adds the deposited amount to the balance amount.

 In the Main class, Get the details as shown in the sample input and create an object for the Account class; invoke the deposit method to deposit the amount and withdraw method to withdraw the amount from the account.

 

Sample Input1 & Output1:

Enter the account number:

1234567890

Enter the available amount in the account:

15000

Enter the amount to be deposited:

1500

Available balance is:16500.00

Enter the amount to be withdrawn:

500

Available balance is:16000.00*/
import java.util.*;

public class Prog_13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accountNumber:");
		long accountNumber = sc.nextLong();
		System.out.println("ENter the available amount in thw account:");
		double balanceAmount = sc.nextDouble();
		Account a = new Account(accountNumber,balanceAmount);

		System.out.println("Enter the amount to be deposited:");
		double depositedAmount = sc.nextDouble();
		a.deposit(depositedAmount);
		System.out.println("Available Balance is:" + a.getBalanceAmount());
		System.out.println("Enter the amount to be withdrawn:");
		double withdrawn = sc.nextDouble();
		if(a.withdraw(withdrawn) == 1)
		{
			System.out.println("Available balance is:" + a.getBalanceAmount());
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}
class Account
{
	private long accountNumber;
	private double balanceAmount;

	public Account(long accountNumber,double balanceAmount)
	{
		this.accountNumber = accountNumber;
		this.balanceAmount = balanceAmount;
	}

	public int withdraw(double withdraw)
	{
		if(withdraw <= getBalanceAmount())
		{
			balanceAmount -= withdraw;
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public void deposit(double depositedAmount)
	{
		balanceAmount += depositedAmount;
	}
	public double getBalanceAmount()
	{
		return balanceAmount;
	}

}
