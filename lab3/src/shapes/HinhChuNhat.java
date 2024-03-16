package shapes;

import java.util.Scanner;

public class HinhChuNhat {
    float dai;
    float rong ;
    float cv;
    float dt;

    public void nhapThongTin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        dai= sc.nextFloat();
        System.out.println("nhap chieu rong: ");
        rong= sc.nextFloat();

    }
    public void tinhChuVi(){
        cv= 2*(dai+rong);

    }
    public void tinhDienTich(){
        dt= dai*rong;
    }
    public void inChuVi(){
        System.out.println("Chu vi: "+ cv);

    }
    public void inDienTich(){
        System.out.println("Dien tich: "+ dt)  ;
        
    }

}
