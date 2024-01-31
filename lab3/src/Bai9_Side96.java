import java.util.Scanner;

public class Bai9_Side96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char c;
        System.err.println("Nhap chuoi: ");
        chuoi= sc.nextLine();
        int demInHoa=0, demInThuong=0, demSo=0;
        for (int i = 0; i < chuoi.length(); i++) {
            c = chuoi.charAt(i);
            int chuyenDoi= (int) c;
            if(chuyenDoi>=65&& chuyenDoi<=90){
                demInHoa++;
            }else if(chuyenDoi>=97&& chuyenDoi<=122){
                demInThuong++;
            }else if(chuyenDoi>=48&& chuyenDoi<=57){
                demSo++;
            }
            
        }
        System.out.println("demInHoa: "+ demInHoa+ "demInThuong:"+ demInThuong+"demSo"+demSo);
    }

    
}
