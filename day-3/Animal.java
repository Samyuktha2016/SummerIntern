import java.util.*;
class Animal
{
	public void makeSound()
	{
		System.out.println("Animal makes Sound");
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog says bow bow!!");
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat says meow meowwwww");
	}
}
class Polymorphism
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.makeSound();
		a=new Dog();
		a.makeSound();
		a=new Cat();
		a.makeSound();
	}
}