package Set_C4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54_HashAdd {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashset = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashset.add(0);
        hashset.add(3);
        hashset.add(1);
        hashset.add(4);
        hashset.add(2);
        hashset.add(8);
       
        System.out.println("Cac phan tu co trong hashSet la: ");
        System.out.println(hashset);
        System.out.println("Nhap number: ");
        number= sc.nextInt();

        // kiem tra ton tai
        if(!hashset.contains(number)){
            hashset.add(number);
            System.out.println("Cac phan tu sau khi them: ");
            System.out.println(hashset);
        }else{
            System.out.println("Phan tu"+ number+" da ton tai");
        }
        



    }
    
}
