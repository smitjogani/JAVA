//calculate Standard Deviation
import java.util.*;

public class standerd_deviaction13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element : ");
        int n = sc.nextInt();

        double [] arr = new double[n];

        for (double i: arr)
        {
            System.out.println("Enter the element  : ");
            arr[i] = sc.nextInt();
        }

        double sd = calculateSD(arr);

        System.out.println("Standerd Deviaction : " + sd ); 
    }

    public static double calculateSD(int arr[])
    {
        double sum = 0.0,standerd_deviaction = 0.0;

        int length = arr.length;

        // sum of elements of array
        for(double num : arr)
        {
            sum += num;
        }

        // find the mean of an array
        double mean = sum / length;

        // calculate the Standard Deviation
        for(double num : arr)
        {
            standerd_deviaction += Math.pow(num - mean , 2);
        }

        return Math.sqrt(standerd_deviaction / length);
    }
}