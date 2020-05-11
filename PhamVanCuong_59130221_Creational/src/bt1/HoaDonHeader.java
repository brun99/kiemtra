/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Date;

/**
 *
 * @author Cuong Pham
 */
public class HoaDonHeader {
    String maHD, tenKH;
    Date ngayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHD, String tenKH, Date ngayBan) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }
    

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "\nHoaDonHeader{" + "maHD=" + maHD + ", tenKH=" + tenKH + ", ngayBan=" + ngayBan + '}';
    }
    
    
    
}
