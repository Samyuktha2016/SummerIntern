import java.util.*;
abstract class Vehicle
{
	abstract void start();
	void fuelType() 
	{
        	System.out.println("Most vehicles use petrol or diesel.");
    	}
}
class Car extends Vehicle 
{
	void start() 
	{
        	System.out.println("Car starts with a key or push button.");
    	}
}
class Bike extends Vehicle 
{
	void start() 
	{
        	System.out.println("Bike starts with a kick or self-start.");
    	}
}
class AbstractionExample 
{
	public static void main(String[] args) 
	{
        	Vehicle car=new Car();
        	car.start();
        	car.fuelType();
		Vehicle bike=new Bike();
        	bike.start();
    	}
}
