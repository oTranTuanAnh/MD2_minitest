package src;

public class NhanVienFulltime extends NhanVien{
    private double tienThuong;
    private double tienPhat;
    private double luongThang;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(double tienThuong, double tienPhat, double luongThang) {
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongThang = luongThang;
    }

    public NhanVienFulltime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double tienThuong, double tienPhat, double luongThang) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongThang = luongThang;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongThang=" + luongThang +
                "} " + super.toString();
    }
    public double luongThucLinh(){
        return (luongThang+tienThuong-tienPhat);
    }
}
