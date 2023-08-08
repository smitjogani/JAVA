import java.util.*;

class ch2p6{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int ch;
        int min,max;
        int sum = 0;
        int avg = 0;

        System.out.println("Enter choice:");
        System.out.println("1.Print values");
        System.out.println("2.Sum");
        System.out.println("3.Average");
        System.out.println("4.Max");
        System.out.println("5.Min");

        ch = sc.nextInt();

        System.out.println("Enter values:");

        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        switch(ch){
            case 1:
                for(int i=0;i<5;i++){
                    System.out.println(arr[i]);
                }
            break;

            case 2:
                for(int i=0;i<5;i++){
                    sum = sum + arr[i];
                }
                System.out.println("Sum:"+sum);
            break;

            case 3:
                for(int i=0;i<5;i++){
                    sum = sum + arr[i];
                }
                avg = sum / 5;
                System.out.println("Average is :" + avg);
            break;

            case 4:
                max = arr[0];
                for(int i=0;i<5;i++){
                    if(max < arr[i]){
                        max = arr[i];
                    }
                }
                System.out.println("Maximum value is " + max);
            break;

            case 5:
                min = arr[0];
                for(int i=0;i<5;i++){
                    if(min > arr[i]){
                        min = arr[i];
                    }
                }
                System.out.println("Minimum value is " + min);
            break;

            default:
                break;
        }
    }
}