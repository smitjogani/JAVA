// Write the program to sort the elements pof the one dimensional array:

class march2{
    public static void main(String[] args) {
        
        int a[] = new int[20];

        int i,j,temp,n;
        n = args.length;

        for(i=0;i<n;i++){
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Elements in unsorted array is :");

        // unsorted element

        for(i=0;i<n;i++){
            System.out.println(a[i] +"\t");
        }

        // sorting elements in array

        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array elemenets are");

        for(i=0;i<n;i++){
            System.out.println(a[i] + "\t");
        }

    }
}