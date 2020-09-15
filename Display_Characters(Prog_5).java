/*Display Characters


Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 

For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.

[Assume the number of inputs should be always 4 ]

Sample Input 1:
Enter the digits:
65
66
67
68

Sample Output 1:
65-A
66-B
67-C
68-D*/

import java.util.*;

public class Prog_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		int arr[] = new int[4];
		for(int i=0;i<4;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<4;i++)
			System.out.println(arr[i] + "-" + (char)arr[i]);
	}
}
