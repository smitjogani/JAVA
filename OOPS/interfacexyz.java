interface Animal
{
	int eyes = 2;
	void walk();
}

class Horse implement Animal
{
	public void walk()
	{
		System.out.println("Walks on 4 legs");
	}
}

public class interfacexyz
{
	public static void main(String[] args) {
		Horse horse = new Horse();
	}
}