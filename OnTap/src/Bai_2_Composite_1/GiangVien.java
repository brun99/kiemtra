/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2_Composite_1;

/**
 *
 * @author Cuong Pham
 */
public class GiangVien extends AbstractKhoa{

    public GiangVien(String name) {
        super(name);
    }

    
    @Override
    public void add(AbstractKhoa k) {  
    }

    @Override
    public void remove(AbstractKhoa k) {
    }

    @Override
    public String getTreeMon() {
        return name;
    }
    
}
