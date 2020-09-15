/*Tina and Louis played a game where one has to tell a letter and the other has to form a sentence with all the words starting with the same letter irrespective of cases. The sentence should contain minimum 3 words and maximum any number of words. For a minimum of three words a score of 2 is given. Each additional word gets a score of 2 .Write a program to check the rules of the game and print the score as given in the sample input, output.

Sample Input 1:

Enter the letter 

S

She sells seashells

Sample Output 1:

Good,You get a score of 2*/
import java.util.*;

public class Prog_20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char a = sc.next().charAt(0);
		a = Character.toLowerCase(a);
		sc.nextLine();
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String arr[] = str.split("\\s");
		int flag = 0;
		for(int i=0;i<arr.length;i++)
		{
			char arr1[] = arr[i].toCharArray();
			if(Character.toLowerCase(arr1[0]) != a )
			{
				System.out.println("No Score");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			int score = 2 + ((arr.length-3) * 2);
			System.out.println("Good,You get a score of " + score);
		}
	}
}
