//polymorphism

class Students
{
	String name;
	int age;

	public void printInfo(String name)
	{
		System.out.println(name);
	}

	public void printInfo(int age)
	{
		System.out.println(age);
	}

	public void printInfo(String name, int age)
	{
		System.out.println(name + " age is " + age);
	}

}

public class polymorphism
{
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "Smit";
		s1.age = 19;

		s1.printInfo(s1.name, s1.age);
	}
}