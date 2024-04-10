package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru(){

    }
    public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich*chieuCao;
    }
}
