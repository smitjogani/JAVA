//Abstraction

abstract class Animal
{
	 abstract void walk();

	 Animal()
	 {
	 	System.out.println("You are creating a new Animal");
	 }

	 public void eat()
	 {
	 	System.out.println("Animal's eat");
	 }
}

class Horse extends Animal
{
	Horse()
	{
		System.out.println("Created a Horse");
	}
	public void walk()
	{
		System.out.println("Walks on 4 legs 🐎 ");
	}
}

class Chicken extends Animal
{
	public void walk()
	{
		System.out.println("Walks on two  legs 🐥 ");
	}
}

public class abstraction
{
	public static void main(String[] args) {
		Horse horse = new Horse();

		// Animal animal = new Animal();  // It is  throw runtime error

	}
}