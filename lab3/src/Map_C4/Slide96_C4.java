package Map_C4;

import java.util.LinkedHashMap;
import java.util.Set;

public class Slide96_C4 {
   

        public static void main(String[] args) {
        LinkedHashMap <Integer, String> m= new LinkedHashMap<>();
        m.put(1, "Java");
        m.put(3, "C++");
        m.put(2, "PHP");
        m.put(4, "Python");

        System.out.println("Truoc khi xoa: ");
        show(m);
        m.remove(2);
        System.out.println("Sau khi xoa: ");
        show(m);
        
    }

        private static void show(LinkedHashMap<Integer, String> m) {
           Set<Integer> s= m.keySet();
           for (Integer key : s) {
            System.out.println(key+ " " +m.get(key));    
           }
        }
}
