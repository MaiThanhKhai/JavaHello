package BaiTapCuoiChuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Nhap so luong phan tu: ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num= sc.nextInt();
           a.add(num);
        }

        int max=  Integer.MIN_VALUE;
        for (Integer i : a) {
            max= Math.max(max, i);
        }
        System.out.println("Gia tri lon nhat trong Arraylist: " + max);


        //ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Nhap 1 so nguyen de xoa:  ");
        int n1 = sc.nextInt();
        //b.add(n1);
        //a.removeAll(b);
        a.remove(n1);

        Collections.sort(a);
        for (Integer j: a) {
            System.out.print(j+" ");
        }



    }
}
