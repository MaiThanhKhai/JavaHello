import java.util.Scanner;

public class Side_81 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong cua ma tran: ");
        m= sc.nextInt();
        System.out.println("nhap so cot cua ma tran: ");
        n= sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("nhap cac phan tu cho ma tran: ");
        for(int i=0; i<m; i++){
            for (int j = 0; i < n; j++) {
                System.out.print("arr[" + i + "]["+ j + "]= ");  
                arr[i][j]= sc.nextInt();                    
            }
        }
        int max= arr[0][0];
        for(int i = 0; i<m; i++){
            for (int j = 0; j < n; j++) {
                if(arr[i][j]< max){
                    max= arr[i][j];
                }        
            }
        }
        System.out.println("phan tu lon nhat trong ma tran: "+ max);      
    }
    
}
