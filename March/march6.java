import java.util.*;

class march7{
    public static void main(String[] args) {
        int ch;
        int sum = 0;
        int avg = 0;
        int max,min;

        Scanner zv = new Scanner(System.in);

        System.out.println("Enter your choice:");

        System.out.println("1.Display values:");
        System.out.println("2.Sum of values:");
        System.out.println("3.Average of values:");
        System.out.println("4.Maximum value:");
        System.out.println("5.Minimum value:");

        ch = zv.nextInt();

        System.out.println("Enter the numbers:");
        int arr [] = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = zv.nextInt();
        }

        switch(ch){
            case 1:
                for(int i=0;i<5;i++){
                    System.out.println("Values are "+arr[i]);
                }
                break;
                
            case 2:
                for(int i=0;i<5;i++){
                    sum = sum + arr[i];
                }
                System.out.println("Sum :"+sum);
                break;

            case 3:
                for(int i=0;i<5;i++){
                    sum = sum + arr[i];
                }
                avg = sum/5;
                System.out.println("Sum :"+sum);
                System.out.println("Average :"+avg);
                break;
            
            case 4:
                max=arr[0];
                for(int i=0;i<5;i++){
                    if(max > arr[i]){
                        max = arr[i];
                    }
                }
                System.out.println("Maximum value:" +max);
                break;

            case 5:
                min = arr[0];
                for(int i=0;i<5;i++){
                    if(min > arr[i]){
                        min = arr[i];
                    }
                }
                System.out.println("Minimum value:" +min);
                break;
            default:
                break;
        }
    }
}