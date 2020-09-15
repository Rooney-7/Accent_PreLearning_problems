/*Average and Grade Calculation


Develop a smart application as Student Grade Calculator(SGC).

Create a class Student with following private attribute :

int id, String name, marks(integer array), float average and char grade. Include appropriate getters and setters methods and a 3 argument constructor with arguments in the order id, name and marks(int array).

public  void calculateAvg()- This method should calculate average and set average mark for the current student.

public void findGrade()- This method should set the grade based on the average calculated. If the average is between 80 and 100 then, then return grade as 'O', else 'A' .If the student gets less than 50 in any of the subjects then return grade as 'F'. Using appropriate setter method set the grade to the student.

(Note : number of subject should be greater than zero, if not display as 'Invalid number of subject' and get number of subject again, Assume mark for a subject should be in the range 0 - 100.  If not display a message "Invalid Mark" and get the mark again)

Write a class StudentMain and write the main method.

In this class, write a method

public static Student getStudentDetails() - this method should get the input from the user for a student, create a student object with those details and return that object.

In main create student’s object by invoking the getStudentDetails method.  Also calculate average and grade for that student object using appropriate methods.

SGC app should get the input and display the output as specified in the snapshot:


Sample Input 1:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
3
Enter mark for subject 1:
95
Enter mark for subject 2:
80
Enter mark for subject 3:
75

Sample Output 1:

Id:123
Name:Tom
Average:83.33
Grade:O


*/
import java.util.*;

public class Prog_16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter the no. of subjects:");
		int no = sc.nextInt();
		sc.nextLine();
		int marks[] = new int[no];
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the mark for subject " + (i+1));
			marks[i] = sc.nextInt();
		}
		Student s = new Student(id,name,marks);

		System.out.println("Id:" + s.getid() + "\nName:" + s.getName());
		s.calculateAvg();
		System.out.println("Average:" + s.getAverage());
		s.findGrade();
		System.out.println("Grade:" + s.getGrade());

	}
}
class Student
{
	private int id;
	private String name;
	private float average;
	private char grade;
	private int marks[];

	public Student(int id,String name,int arr[])
	{
		this.id = id;
		this.name = name;
		this.marks = arr;	
	}

	public void setAverage(float avg)
	{
		this.average = avg;
	}
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	public void setMarks(int marks[])
	{
		this.marks = marks;
	}
	public int getid()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}


	public float getAverage()
	{
		return this.average;
	}
	public char getGrade()
	{
		return this.grade;
	}
	public int[] getMarks()
	{
		return this.marks;
	}


	public void calculateAvg()
	{
		float sum=0;
		for(int i:getMarks())
		{
			sum += i;
		}
		this.setAverage(sum/getMarks().length);
	}

	public void findGrade()
	{
		float avg = this.getAverage();

		if(avg >= 80 && avg <= 100)
		{
			this.setGrade('O');
		}
		else 
		{
			this.setGrade('A');
		}
		for(int i:this.getMarks())
		{
			if(i < 50)
			{
				this.setGrade('F');
				break;
			}
		}
	}

}
