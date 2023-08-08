import java.util.*;

public class MapCollection {
    public static void main(String[] args) {
        // Hashmap

        // HashMap<String, Integer> map = new HashMap<String, Integer>();
        // map.put("Second", 5);
        // map.put("First", 20);
        // System.out.println(map);

        // Treemap
        // TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        // tmap.put("Second", 5);
        // tmap.put("First", 20);

        // System.out.println(tmap);
        // System.out.println(tmap.get("First"));
        // System.out.println(tmap.keySet());
        // System.out.println(tmap.values());

        int arr[] = { 1, 242, 3, 454, 52, 62, 37 };
        // for (int e : arr) {
        //     System.out.print(e + " ");
        // }
        // System.out.println(arr);
        Arrays.sort(arr);
        // System.out.println(arr);
        // for (int e : arr) {
        //     System.out.print(e + " ");
        // }
        System.out.println(Arrays.binarySearch(arr, 3));
    }
}