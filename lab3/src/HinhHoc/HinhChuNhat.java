package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai, rong;
    Scanner sc = new Scanner(System.in);
    
    public HinhChuNhat(){

    }
    public void nhapChieuDai(){
        System.out.println("nhap chieu dai: ");
        dai= sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("nhap chieu rong: ");
        rong= sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2*(dai+rong);
    }
    public void tinhDienTich(){
        dienTich = dai*rong;
}

    
}
