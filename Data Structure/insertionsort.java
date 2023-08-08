//insertion sort

public class insertionsort
{
	public static void printArr(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {7, 8, 3, 1, 2};

		System.out.println("Before Sorting :");
		printArr(arr);

		//insertion sort
		for(int i = 0; i < arr.length; i++)
		{
			int current = arr[i];
			int j = i - 1;

			while(j >= 0 && current < arr[j])
			{
				arr[j + 1] = arr[j];
				j--;
			}

			//placement

			arr[j + 1] = current;
		}

		System.out.println("After Sorting :");
		printArr(arr);
	}
}