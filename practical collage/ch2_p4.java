public class ch2_p4 {
 public static void main(String[] args) {
     int i,n;
     String name[] = {"smit","jay","harsh","sahil","keval"};
     int price[] = {11,22,33,55,44};

     n = price.length;

     int small = price[0];
     for(i=0;i<n-1;i++){
         if(small > price[i]){
             small = price[i];
         }
     }
     for(i=0;i<n-1;i++){
         if(small == price[i]){
             System.out.println(name[i]);
         }
     }
 }   
}
