import java.util.Scanner;

public class giaiPTBac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = sc.nextDouble();
        System.out.println("nhap b: ");
        double b = sc.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem");
            }else{
               System.out.println("phuong trinh vo nghiem"); 
            }

        }else{
          double   kq= -b/a;
          System.out.println("pt cco nghiem " +kq);
        }

    }
}
