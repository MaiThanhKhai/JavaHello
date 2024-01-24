import java.util.Scanner;

public class TimSoNhoHon {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a= sc.nextInt();
        System.out.println("nhap b: ");
        b= sc.nextInt();

        int min= a;
        if(a>b){
            min=b;
            System.out.println("so nho hon la: "+ min);
         
        }
        

        
        
    }
        
}
