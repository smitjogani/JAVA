import java.util.*;

public class arrayList
{
	public static void main(String[] args) {

		//Integer | Float | Boolean | String 
		ArrayList<Integer> list = new ArrayList<Integer>();

		//Add elements
		list.add(0);
		list.add(2);
		list.add(3);

		System.out.println(list);

		//get elements
		int element = list.get(0);
		System.out.println(element);

		//add element in between

		list.add(1, 100); //where 1 is position and 100 is value
		list.add(4, 2002);
		System.out.println(list);

		//set element
		list.set(0, 23); //Where 0  is position and 23 is value
		System.out.println(list);

		//delete element
		list.remove(2);
		System.out.println(list);

		//Size
		int size = list.size();
		System.out.println("The size of list is " + size);

		//loops
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();

		//sorting
		Collections.sort(list);
		System.out.println(list);
	}
}