package BaiTapCuoiChuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("Nhap vao so luong: ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num =sc.nextInt();
            ll.add(num);
        }
        int tongCuaSoChan=0;
        int cnt= 0;
        for (Integer integer : ll) {
            if(integer%2==0){
                ++cnt;
                tongCuaSoChan+= integer;
            }
        }
        System.out.println("So trung binh cong cua cac so chan trong ll la: "+(double) tongCuaSoChan/cnt);
    }
}
