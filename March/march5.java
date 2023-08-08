// fetch the company name who has quoted lowest amount(use array)

class march5{
    public static void main(String[] args) {
        int i,n;
        
        String name[] = {"a", "b" , "c" , "d" , "e"};
        int price[] = {55,45,65,85,95};

        n = price.length;
        int small = price[0];

        for(i=1;i<n-1;i++){
            if(small > price[i]){
                small = price[i];
            }
        }

        for(i = 0; i<n-1; i++){
            if(small == price[i]){
                System.out.println(name[i]);
            }
        }


    }
}