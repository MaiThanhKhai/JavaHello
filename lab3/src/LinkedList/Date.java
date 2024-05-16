package LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class Date {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linked = new LinkedList<>();
    linked.add("Thang 1");
    linked.add("Thang 2");
    linked.add("Thang 3");
    linked.add("Thang 4");
    linked.add("Thang 5");
    linked.add("Thang 6");
    linked.add("Thang 7");
    linked.add("Thang 8");
    linked.add("Thang 9");
    linked.add("Thang 10");
    linked.add("Thang 11");
    linked.add("Thang 12");

    System.out.println("nhap  vao chi so cua phan tu duoc lay: ");
    int index= sc.nextInt();
    // kiem tra neu chi so lon hon hoac bang 0
    //va nho hon kich thuoc cua linkedlist-1 thi moi lay
    //nguoc lai thong bao loi

    if(index<0 || index> (linked.size()-1)){
        System.out.println("Chi so can lay phaia lon hon khong va nho hon"+(linked.size()-1) );
    }else{
        String node = linked.get(index);
        System.out.println("Phan tu co chi so: "+index+" trong linked la: "+ node);
    }
    String fistNode = linked.getFirst();
    String lastNode = linked.getLast();
    System.out.println("\nPhan tu dau tien trong danh sach la" +fistNode+"; Phan tu o cuoi danh sach la"+ lastNode);
   }
    
}
