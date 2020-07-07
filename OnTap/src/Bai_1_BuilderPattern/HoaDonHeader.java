
package Bai_1_BuilderPattern;

import java.util.Date;


public class HoaDonHeader {
    String maHoaDon, tenBanHang;
    Date ngayBan;

    public HoaDonHeader() {
    }
    

    public HoaDonHeader(String maHoaDon, String tenBanHang, Date ngayBan) {
        this.maHoaDon = maHoaDon;
        this.tenBanHang = tenBanHang;
        this.ngayBan = ngayBan;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenBanHang() {
        return tenBanHang;
    }

    public void setTenBanHang(String tenBanHang) {
        this.tenBanHang = tenBanHang;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHoaDon=" + maHoaDon + ", tenBanHang=" + tenBanHang + ", ngayBan=" + ngayBan + '}';
    }
    
    
}
