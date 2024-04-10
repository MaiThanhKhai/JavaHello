package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron(){

    }
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2*Pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich = Pi*banKinh*banKinh;
    }
    @Override
    public void xuatThongtin(){
        System.out.println("day la hinh tron");
    }
    public float getBanKinh(){
        return banKinh;
    }
    public void setBanKinh(float banKinh){
        this.banKinh= banKinh;
    }
}
