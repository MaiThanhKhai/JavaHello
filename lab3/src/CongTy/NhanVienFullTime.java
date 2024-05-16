package CongTy;
import java.util.*;;
public class NhanVienFullTime extends NhanVien {
    private int ngayLamViec;
    private int loaiChucVu;
    
    public NhanVienFullTime(){
    }
    public NhanVienFullTime( int ngayLamViec, int loaiChucVu){
        this.ngayLamViec = ngayLamViec;
        this.loaiChucVu= loaiChucVu;
    }
    public void setLoaichucvu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
        return "nhan vien toan thoi gian";
    }
    public void tinhLuong(){
        if(loaiChucVu==1)
        luong = LuongCoDinh.luongSep + ngayLamViec*LuongCoDinh.lamThem;
        if(loaiChucVu==2){
        luong = LuongCoDinh.luongNhanVien + ngayLamViec*LuongCoDinh.lamThem;
        }
    }
    

    
    
}
