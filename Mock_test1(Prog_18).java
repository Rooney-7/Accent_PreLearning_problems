import java.util.*;

/*Write a Java program to read a string from the user 
and fetch the middle characters that feature in the 
center of the string from the input string and return 
it as string output.*/

public class Prog_18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		char arr[] = s.toCharArray();
		int len = arr.length;
		System.out.println(len);
		if(len % 2 == 0)
		{
			System.out.print(arr[((len/2)-1)]);
			System.out.print(arr[(len/2)]);
		}
		else
		{
			System.out.println(arr[len/2]);
		}
	}
}