/*Two words of same letters

Write a program to get two strings as input from the user. The program should check if both the strings contains the same letters.

Note: Both the string values will be in lowercase.


Sample Input 1:

tea

ate

Sample Output 1:

Same*/
import java.util.*;

public class Prog_17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		char arr1[] = a.toCharArray();
		char arr2[] = b.toCharArray();

		int flag;
		if(arr1.length >= arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				flag = 0;
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i] == arr2[j])
					{
						flag = 1;
						break;
					}
				}
				if(flag != 1)
				{
					System.out.println("Different");
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<arr2.length;i++)
			{
				flag = 0;
				for(int j=0;j<arr1.length;j++)
				{
					if(arr1[i] == arr2[j])
					{
						flag = 1;
						break;
					}
				}
				if(flag != 1)
				{
					System.out.println("Different");
					break;
				}
			}
		}

	}
}
