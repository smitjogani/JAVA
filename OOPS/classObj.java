//Classes and Objects 

//class
class Pen
{
	String colour;
	String type;

	//methods
	public void write()
	{
		System.out.println("Writing something ✍️");
	}

	public void printColorType()
	{
		System.out.println(this.colour);
		System.out.println(this.type);
	}
}

class Students
{
	String name;
	int age;

	//method
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}

	//constructer
	Students(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//copy constructer
	Students(Students s2)
	{
		this.name = s2.name;
		this.age = s2.age;
	}

	Students(){}
}

public class classObj
{
	public static void main(String[] args) 
	{
		Pen pen1 = new Pen(); //object
		pen1.colour = "Blue";
		pen1.type = "Gel";

		pen1.write();

		pen1.printColorType();

		Pen pen2 = new Pen();//object
		pen2.colour = "Black";
		pen2.type = "Bollpen";

		pen2.printColorType();

		Students s1 = new Students(/*"Smit", 19*/);//object
		s1.printInfo();

		s1.name = "smit";
		s1.age = 19;

		Students s2 = new Students(s1);
		s2.printInfo();
	}
} 