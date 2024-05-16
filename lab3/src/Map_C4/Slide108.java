 package Map_C4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108 {
    public static void main(String[] args) {
        TreeMap<Integer,Double> tm = new TreeMap<>();
        tm.put(1, 9d);
        tm.put(4, 10.1d);
        tm.put(2, 7.2d);
        tm.put(8, 20.28d);

        System.out.println("Cac phan tu co trong TreMap: ");
        Set<Map.Entry<Integer, Double>> setTreMap = tm.entrySet();
        System.out.println(setTreMap);

        tm.replace(4,20.11d);
        tm.replace(2,7.2d,7.7d );
        System.out.println("Cac phan tu co trong TreMap sau khi thay the: ");
        setTreMap=tm.entrySet();
        System.out.println(setTreMap);


    }

    
}