package src;

public class NhanVienParttime extends NhanVien{
    private double soGioLamViec;

    public NhanVienParttime() {
    }

    public NhanVienParttime(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public NhanVienParttime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double soGioLamViec) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soGioLamViec = soGioLamViec;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "soGioLamViec=" + soGioLamViec +
                "} " + super.toString();
    }

    @Override
    public double luongThucLinh() {
        return soGioLamViec*100000;
    }

}
