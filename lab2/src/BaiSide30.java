import java.util.Scanner;

public class BaiSide30 {

    public static void main(String[] args) {
        int n, soDu, tong=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("nhap so nguyen: ");
        n = sc.nextInt();
        while(n>0){
            soDu = n%10;
            n=n/10;
            tong+=soDu;
        }
        System.out.println("tong cac chu so: "+ tong);


    }
}