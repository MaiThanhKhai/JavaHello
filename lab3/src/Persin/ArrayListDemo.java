package Persin;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    ArrayList<Person> arrList = new ArrayList<Person>();

    public void themPhanTu(){
        Person s = new Person();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so luong doi tuong:  ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            s.nhapThongTin(); 
            this.arrList.add(s);     
        }   
    }
    public void  hienThiThongTin(){
        for (int i = 0; i < arrList.size(); i++) {
            this.arrList.get(i).inThongTin();
        }
    }
    public void suaThongTin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ban muon sua tai vi tri nao: ");
        int index= sc.nextInt();
        Person p = new Person();
        p.nhapThongTin();
        this.arrList.set(index,p);
    }
    public void xoaThongTin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("1. Xoa het ");
        System.out.println("2. Xoa phan tu chi dinh");
        int luachon= sc.nextInt();
        
        if(luachon==1){
            this.arrList.removeAll(arrList);
        }else if(luachon==2){
            System.out.println("nhap phan tu chi dinh");
            int index= sc.nextInt();
            this.arrList.remove(index);
        }
        
        
      
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        ArrayListDemo a = new ArrayListDemo();
        while(true){
        System.out.println("------Menu-----");
        System.out.println("1. them thong tin");  
        System.out.println("2. in thong tin");  
        System.out.println("3. sua thong tin");  
        System.out.println("4. xoa thong tin");  
        System.out.println("5. thoat");
        int luachon = sc.nextInt();
        if(luachon==1){
            a.themPhanTu();
        }else if(luachon==2){
            a.hienThiThongTin();
        }else if(luachon==3){
            a.suaThongTin();
        }else if(luachon==4){
            a.xoaThongTin();
        }
        }
        
    }
    
   
    



}
