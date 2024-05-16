package Map_C4;

import java.util.LinkedHashMap;
import java.util.Map;

public class slide95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(100,"Mo" );
        lhm.put(101,"Dia" );
        lhm.put(102,"Chat" );

        for(Map.Entry <Integer, String> m:  lhm.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
        System.out.println("Truoc khi xoa" +lhm);
        lhm.remove(101);
        System.out.println("Sau khi xoa: "+ lhm);
    }
}
