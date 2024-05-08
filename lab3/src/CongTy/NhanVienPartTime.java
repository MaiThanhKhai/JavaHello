package CongTy;
import java.util.*;
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }
  //  @Override
    public void tinhLuong(){
        luong= LuongCoDinh.luongNhanVienPartTime*gioLamViec;
    }


}
