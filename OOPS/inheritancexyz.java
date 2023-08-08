class Shape 
{
	public void are()		
	{
		System.out.println("Display the area");
	}
}

class Triangle extends Shape
{
	public void area(int l, int h)
	{
		System.out.println(1/2 * l * h);
	}
}

cass Circle extends Shape
{
	public void area(int r)
	{
		System.out.println((3.14) * r * r);
	}
}

class EquilateralTriangle extends Triangle
{
	public void area(int l, int h)
	{
		System.out.println(1/2 * l * h);
	}
}

public class inheritancexyz
{
	public static void main(String[] args) 
	{
	}
}