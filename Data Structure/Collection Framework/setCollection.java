import java.util.*;

public class setCollection {
    public static void main(String[] args) {
        
        // hashset
        /*Set<Integer> s = new HashSet<>();

        s.add(10);
        s.add(5);
        s.add(16);
        s.add(2);
        s.add(20); 

        System.out.println(s);
        */

        //Linked hashset
        /*LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
        lh.add(5);
        lh.add(2);
        lh.add(2);
        lh.add(10);

        System.out.println(lh);*/

        //Treeset
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(20);
        t.add(5);
        t.add(10);
        t.add(12);
        t.add(6);
        t.add(6);

        System.out.println(t);
    }
}
