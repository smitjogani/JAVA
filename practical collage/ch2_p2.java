public class ch2_p2 {
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array before reverse :");

        for(int i = 0;i<n.length;i++){
            System.out.println(n[i] + " ");
        }
        for(int i=0;i<n.length/2;i++){
            int temp = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = temp;
        }
        System.out.println("\narray after reverse:");
        for(int i=0;i<n.length;i++){
            System.out.println(n[i] + " ");
        }
    }    
}
