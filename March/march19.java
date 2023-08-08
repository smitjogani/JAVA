//Convert Char to Int Using String.valueOf() method

class march19{
    public static void main(String[] args) {
        char ch = '3';

        System.out.println("Char value: " + ch);

        int a = Integer.parseInt(String.valueOf(ch));

        System.out.println("Int value: " +a);
    }
}