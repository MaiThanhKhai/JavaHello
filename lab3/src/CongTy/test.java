package CongTy;
import java.util.*;
public class test {
    public static void main(String[] args) {
        // NhanVienFullTime sep = new NhanVienFullTime(" Nguyen Van Huu");
        // sep.setLoaichucvu(LuongCoDinh.nhanVien_Sep);
        // NhanVienFullTime linh1 = new NhanVienFullTime("Mai Thanh Khai");
        // NhanVienFullTime linh2 = new NhanVienFullTime("Tran DAnh Tue", 3);
        NhanVienPartTime thoiVu = new NhanVienPartTime("Nguyen Van A", 240);

        // sep.tinhLuong();
        // linh1.tinhLuong();
        // linh2.tinhLuong();
        thoiVu.tinhLuong();

        // sep.xuatThongTin();
        // linh1.xuatThongTin();
        // linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
    
}
