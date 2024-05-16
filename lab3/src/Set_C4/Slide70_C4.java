package Set_C4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Slide70_C4 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
         int number;
        Scanner sc = new Scanner(System.in);
        ts.add(0);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(2);
        ts.add(8);
       
        System.out.println("Cac phan tu co trong hashSet la: ");
        System.out.println(ts);
        System.out.println("Nhap number: ");
        number= sc.nextInt();

        // kiem tra ton tai
        if(!ts.contains(number)){
            ts.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu sau khi them: ");
            System.out.println(ts);
        }else{
            System.out.println("Phan tu"+ number+" da ton tai");
        }
        
        
    }
    
}
