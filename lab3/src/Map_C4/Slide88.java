package Map_C4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
            HashMap<String, String> hm = new HashMap<>();
            hm.put("Qng"," Quang Ngai");
            hm.put("QN", "Quang Nam");
            hm.put("QN", "Quang Ninh");
            hm.put("HCM", "Thanh Pho Ho Chi Minh");

            System.out.println("Danh sach cac thanh pho co trong map la: ");
            Set<Map.Entry<String, String>> setMap = hm.entrySet();
            System.out.println(setMap);

            System.out.println("Qng: " +hm.get("Qng"));
            System.out.println("HN: "+hm.get("HN"));
            if(hm.containsValue("Thanh Pho Ho Chi Minh")){
                System.out.println("Da co trong hashMap");
            }

    }
}
