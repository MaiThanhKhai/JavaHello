
import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        do{
            System.out.println("Nhap so luong phan tu cua mang:  ");
            n= sc.nextInt();
        }while(n<=0);
        
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Mang ban dau:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        
        

    }
    
}
