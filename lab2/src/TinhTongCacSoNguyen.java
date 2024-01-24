import java.util.Scanner;

public class TinhTongCacSoNguyen {
    public static void main(String[] args) {
        int n,tong=0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("nhap vao so nguyen bat ki: ");
        n= sc.nextInt();
        tong+=n;
        
        }while(tong<100);
        System.out.println("Tong la "+ tong);
    }
    
}
