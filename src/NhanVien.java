package src;

public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private String soDienThoai;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public abstract double luongThucLinh();
}
