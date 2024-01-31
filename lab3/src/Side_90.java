import java.util.Scanner;

public class Side_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kytu;
        System.out.println("nhap vao chuoi: ");
        chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            kytu= chuoi.charAt(i);
            System.out.println(kytu);
        }
        
        
    }
}