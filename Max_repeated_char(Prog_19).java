/*Maximum repeated number

In a given array find the maximum value which gets repeated for the maximum number of times. If two values get repeated for maximum number of times, then print the largest one.

[Input format: First input refers to the no of elements in the array and the next is the series of elements in the array]

Sample Input1:

5

3

2

3

2

2

Sample Output1:

2*/
import java.util.*;

public class Prog_19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int arr[] = new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count_largest= 0;
		int largest_no =arr[0];
		int prev =0 ;
		for(int i=0;i<no;i++)
		{
			count_largest = 0;
			for(int j=i;j<no;j++)
			{
				if(arr[i] == arr[j])
				{
					count_largest++;
					if(count_largest > prev)
					{
						largest_no = arr[i];
						prev = count_largest;
					}
					else if(count_largest == prev && arr[i] > largest_no)
					{
						largest_no = arr[i];
					}
				}
			}
		}
		System.out.println(largest_no);
	}
}
