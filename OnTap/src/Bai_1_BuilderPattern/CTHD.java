package Bai_1_BuilderPattern;


public class CTHD {
    String sanPham;
    int soLuong, chiecKhau;
    double donGia;

    public CTHD(String sanPham, int soLuong, int chiecKhau, double donGia) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.chiecKhau = chiecKhau;
        this.donGia = donGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getChiecKhau() {
        return chiecKhau;
    }

    public void setChiecKhau(int chiecKhau) {
        this.chiecKhau = chiecKhau;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "CTHD{" + "sanPham=" + sanPham + ", soLuong=" + soLuong + ", chiecKhau=" + chiecKhau + ", donGia=" + donGia + '}';
    }
    
    
}
