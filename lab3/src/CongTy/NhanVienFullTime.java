package CongTy;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamViec;
    private int loaiChucVu;
    
    public NhanVienFullTime(String ten){
        this.ten= ten;
    }
    public NhanVienFullTime(String ten, int ngayLamViec){
        this.ten= ten;
        this.ngayLamViec = ngayLamViec;
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
