package CongTy;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){};
    public NhanVien(String ten){
        this.ten= ten ;
    }
    public String loaiNhanVien(){
        return "";
    }
    public void xuatThongTin(){
        System.out.println( ten+ " co luong la: "+ luong);
    }
}
