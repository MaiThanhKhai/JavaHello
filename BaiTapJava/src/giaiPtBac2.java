import java.util.Scanner;

public class giaiPtBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = sc.nextDouble();
        System.out.println("nhap b: ");
        double b = sc.nextDouble();
        System.out.println("nhap c: ");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;
        if(delta > 0){
            double x1= -b-Math.sqrt(delta)/2*a;
            double x2= -b+Math.sqrt(delta)/2*a;
            System.out.println("x1 : " +x1+" x2="+ x2 );
        }else if(delta==0){
            double x= -b/2*a;
            System.out.println("phuong trinh co nghiem kep la " + x);

        }else{
            System.out.println("pt vo ngiem");

        }
       
        
        
        

    }
    
}
