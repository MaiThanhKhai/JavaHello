import java.util.Scanner;

public class Employee {
    public int maNhanVien;
    public String hoTen;
    public int namSinh;

    public int tinhTuoi(){
        return 2024- namSinh;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        maNhanVien= sc.nextInt();
        System.out.println("ho ten: ");
        sc.nextLine();
        hoTen= sc.nextLine();
        System.out.println("nam sinh: ");
        namSinh = sc.nextInt();

    }
    public void in(){
        System.out.println("Ma nhan vien: "+ maNhanVien);
        System.out.println("Ho ten: "+ hoTen);
        System.out.println("Nam sinh: "+ namSinh);
        System.out.println("Tuoi: " +tinhTuoi());
        
    }
    
}
