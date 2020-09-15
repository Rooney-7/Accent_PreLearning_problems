/*Volume calculator- Over Loading

Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.

Create a class called VolumeCalculator that has the following methods
double calculateVolume(double radius,double height)
This method calculates the volume of the cylinder using the formula 3.14*radius*radius*height
double calculateVolume(int length,int breadth,int height)
This method calculates the volume of the cuboid using the formula length*breadth*height
Write a TestMain class to test the application.

Sample Input

Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
1
Enter the radius
3
Enter the height
2

Output
Volume of the Cylinder is 56.52*/
import java.util.*;

public class Prog_14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice\n1.Volume of Cylinder\n2.Volume of Cuboid:");
		int choice = sc.nextInt();
		VolumeCalculator vc = new VolumeCalculator();
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the radius-");
				double radius = sc.nextInt();
				System.out.println("Enter the height-");
				double height = sc.nextInt();
				System.out.println(String.format("%.2f",vc.calculateVolume(radius,height)));

			}
			case 2:
			{
				System.out.println("Enter the length-");
				int length = sc.nextInt();
				System.out.println("Enter the breadth-");
				int breadth = sc.nextInt();
				System.out.println("Enter the height-");
				int height = sc.nextInt();
				System.out.println(String.format("%.2f",vc.calculateVolume(length,breadth,height)));
			}
		}
	}
}

class VolumeCalculator
{
	double calculateVolume(double radius,double height)
	{
		return (3.14*radius*radius*height);
	}
	double calculateVolume(int length,int breadth,int height)
	{
		return (length*breadth*height);
	}

}
