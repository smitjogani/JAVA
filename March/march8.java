interface exam{
    public boolean pass(int mark);
}

interface classify{
    public String division(int average);
}

class result implements exam,classify{
    public boolean pass(int mark){
        if(mark >= 35){
            return true;
        }
        else{
            return false;
        }
    }

    public String division(int average){
        String str;

        if(average >= 60){
            return str = "First";
        }
        else if(average >= 50 && average < 60){
            return str = "Second";
        }
        else if(average < 50){
            return str = "no division";
        }
        return str = null;
    }
}

class march8{
    public static void main(String[] args) {
        result r = new result();

        System.out.println("" + r.pass(40));
        System.out.println("" + r.division(58));
    }
}