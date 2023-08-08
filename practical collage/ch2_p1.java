public class ch2_p1 {
    public static void main(String[] args) {
        int a[] = new int[20];
        int j,temp,i,n;

        n = args.length;

        for(i=0;i<n;i++){
            a[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Element in the unsorted are:");
        for(i=0;i<n;i++){
            System.out.println(a[i] + "\t");
        }

        for(i=0;i<n;i++){

            for(j=0;j<n;j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted element are:");

        for(i=0;i<args.length;i++){
            System.out.println(a[i] + "\t");
        }

    }
}
