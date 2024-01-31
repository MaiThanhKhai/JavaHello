import java.util.Scanner;

public class Bai10_Side96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char c ;
        System.out.println("nhap chuoi: ");
        chuoi = sc.nextLine();
        System.out.println("nhap ki tu can dem");
        c = sc.next().charAt(0);

        int dem=0;
        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i)==c){
                dem++;
            }
        }
         System.out.println("So lan xuat hien cua "+ c+" la :" + dem);
         


    }
    
}
