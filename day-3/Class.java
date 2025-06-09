import java.util.*;
class Human
{
	int age;
	String gender;
	public void show(int age,String gender)
	{
		this.age=age;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println("In Human class");
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
}
class Student
{
	String name;
	int marks;
	public void show1(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void display1()
	{
		System.out.println("In Student class");
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}
class Developer
{
	String Name;
	int id;
	String location;
	public void show2(String Name,int id,String location)
	{
		this.Name=Name;
		this.id=id;
		this.location=location;
	}
	public void display2()
	{
		System.out.println("In Developer class");
		System.out.println("Name: "+Name);
		System.out.println("Id: "+id);
		System.out.println("Location: "+location);
	}
}
		
	
class Main
{
	public static void main(String args[])
	{
		Human h=new Human();
		h.show(20,"female");
		h.display();
		Student s=new Student();
		s.show1("Samyuktha",25);
		s.display1();
		Developer d=new Developer();
		d.show2("Samyuktha",35,"Hyderabad");
		d.display2();
	}
}

		
		