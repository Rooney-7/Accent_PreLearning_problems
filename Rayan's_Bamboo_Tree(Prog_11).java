/*Rayan bought a Bamboo tree sapling to grow in his garden and it was 3 feet tall when he planted. To his surprise he finds that every year the bamboo tree grows double its current height. How many years will it take for the bamboo tree to reach  a  height of  X feet.

Sample input 1

768

Sample output 1

It will take 8 years for the Bamboo tree to reach a height 768 feet.*/
import java.util.*;

public class Prog_11{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int count=0;
		while(height != 3)
		{
			count++;
			height = height/2;
		}
		System.out.println(count);
	}
}
