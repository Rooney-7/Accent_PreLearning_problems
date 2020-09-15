/*Reverse The Number

Write a program to reverse a given number. Say for example, If the given number is 35(thrity five), it should be reversed as 53(fifty three)].  If the input given is zero display Output is:0. If the input is less than zero then display "Number should be positive"

Refer the sample input and output.


Sample Input 1 :

Enter The Number:

478

Sample Output  1:
Output is:874*/
import java.util.*;

public class Prog_9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int no = sc.nextInt();
		if(no <= 0)
		{
			System.out.println("Number should be positive int");
			System.exit(0);
		}

		int new_no=0,nno=0;
		while(no != 0)
		{
			nno = no %10;
			no = no - nno;
			no /= 10;
			new_no = new_no * 10 + nno;
		}

		System.out.println(new_no);



	}
}
