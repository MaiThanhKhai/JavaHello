import java.util.Scanner;

public class Bai3_Side90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten= sc.nextLine();
        System.out.println("nhap tuoi: ");
        int tuoi= sc.nextInt();

        if(tuoi<16){
            System.out.println("Ban " + ten+ "o do tuoi vi thanh nien");
        }else  if(tuoi>16 && tuoi < 18){
            System.out.println("Ban " + ten+ "o do tuoi truong thanh");
    }else if(tuoi>18){
        System.out.println("Ban " + ten+ "da gia");
    }

    
}
}