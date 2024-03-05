import java.io.InputStream;
import java.util.Scanner;

public class Student {
    public int maSinhVien;
    public String hoTen;
    public String gioiTinh;
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma sinh vien: ");
        maSinhVien = sc.nextInt();
        System.out.println("Ho Ten: ");
        sc.nextLine();
        hoTen= sc.nextLine();
        System.out.println("Gioi tinh: ");
        gioiTinh = sc.nextLine();     
        
    }
    public void hienThi(){
        System.out.println("Ma sinh vien: "+ maSinhVien);
        System.out.println("Ho Ten: "+ hoTen);
        System.out.println("Gioi tinh: "+ gioiTinh); 
        
    }
    
}
