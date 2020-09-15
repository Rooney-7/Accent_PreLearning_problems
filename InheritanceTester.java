class Vehicle
{ 
  public Vehicle()
  { 
    System.out.print("Default "); 
  } 
} 
class Car extends Vehicle
{ 
public Car(String carName)
{ 
System.out.print(carName + ""); 
} 
} 
public class InheritanceTester
{
  public static void main(String[] args) 
  { 
    Car car=new Car("Ford");
  }
}