package Map_C4;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Slide106 {
    public static void main(String[] args) {
        TreeMap <Integer, Character> tm = new TreeMap<>();
        tm.put(6, 'A');
        tm.put(5, 'B');
        tm.put(1, 'C');
        tm.put(2, 'D');
        tm.put(8, 'E');

        Set<Entry<Integer, Character>> setTryMap = tm.entrySet();
        System.out.println("Cac entry co trong setTryMap: ");
        System.out.println(setTryMap);

    }
    
}
