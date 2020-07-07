/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_TemplatePattern;

/**
 *
 * @author Cuong Pham
 */
public class SinhVienDB extends  EntityDB<SinhVien>{

    @Override
    SinhVien findById(int id) {
        for (SinhVien sinhVien : list) {
            if (sinhVien.getMaSV() == id)
                return sinhVien;
        }
        return null;
    }

    @Override
    int getKey(SinhVien t) {
        return t.getMaSV();
    }

    @Override
    void show() {
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
    }
    
}
