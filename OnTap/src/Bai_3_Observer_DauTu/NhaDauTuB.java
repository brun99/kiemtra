/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_Observer_DauTu;

import Bai_3_Observer_DauTu.TiGia.TiGiaThayDoiListenner;

/**
 *
 * @author Cuong Pham
 */
public class NhaDauTuB implements TiGiaThayDoiListenner{
  
    float tigia;
    boolean dangky = false;
    
    public void dangky(TiGia t){
        t.dangKy(this);
        
    }
    public void huyDangKy(TiGia t){
        t.huyDangKy(this);
        dangky  = false;
    }
    @Override
    public void CapNhapTiGia(float tigiamoi) {
        if(this.dangky){
            if(tigiamoi > tigia){
                System.out.println("nha dau tu b: mua vao");
            }
            else if(tigiamoi == tigia){
                System.out.println("nha dau tu b: ban ra ");
            }
            else{
                System.out.println("nha dau tu b: ban ra");
            }
        }
        else{
            tigia = tigiamoi;
            dangky = true;
        }
    }
    
}