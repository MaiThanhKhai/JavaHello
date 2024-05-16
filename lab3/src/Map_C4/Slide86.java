 package Map_C4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
        HashMap <String, String> hm = new HashMap<>();
        hm.put("CSLT", "Co so lap trinh");
        hm.put("C++", "C++");
        hm.put("C#", "C Sharp");
        hm.put("Java", "Java");
        hm.put("PHP", "PHP");

        Set<Map.Entry<String, String >> setHashMap = hm.entrySet();
        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
        

    }

    
}