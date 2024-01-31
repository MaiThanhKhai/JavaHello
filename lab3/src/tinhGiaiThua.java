import java.util.Scanner;

public class tinhGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        }while(n<0);
        int giaiThua= 1;
        for (int i = 1; i < n; i++) {
            giaiThua*=i;          
        }
        System.out.println("Giai thua cua "+n+" la "+ giaiThua);

        

    }
    
}
