import java.util.Scanner;

public class HinhTron {
    public float banKinh;
    public final float Pi= 3.14f;
    public float chuVi;
    public float dienTich;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("R= ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2*Pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich = Pi*banKinh*banKinh;
    }
    public void inChuVi(){
        System.out.println("Chu vi= "+ chuVi);
    }
    public void inDienTich(){
        System.out.println("Dien tich= "+ dienTich);
    }
    
}
