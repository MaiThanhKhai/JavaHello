package CongTy;
import java.util.*;
public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){};
    public NhanVien(String ten, long luong){
        this.ten= ten ;
        this.luong=luong;
    }
    public String loaiNhanVien(){
        return "";
    }
    public void xuatThongTin(){
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Loai nhan vien: " + loaiNhanVien());
        System.out.println("Luong: " + luong + " VND");
    } 
}
