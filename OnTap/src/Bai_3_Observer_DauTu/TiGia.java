/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_Observer_DauTu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cuong Pham
 */
public class TiGia {
    float tigia;
    List<TiGiaThayDoiListenner> listenner = new ArrayList();

    public TiGia(float tigia) {
        this.tigia = tigia;
    }
    
    public void dangKy(TiGiaThayDoiListenner listenner){
        if(!this.listenner.contains(listenner)){
            this.listenner.add(listenner);
            listenner.CapNhapTiGia(tigia);
        }
    }
    public void huyDangKy(TiGiaThayDoiListenner listenner){
        if(this.listenner.contains(listenner)){
            this.listenner.remove(listenner);
        }
    }
    public void thayDoiTiGia(float delta){
        tigia += delta;
        for(TiGiaThayDoiListenner l: listenner){
            l.CapNhapTiGia(tigia);
        }
    }
            
    public static interface TiGiaThayDoiListenner{
        public void CapNhapTiGia(float tiGia1);
    } 
}
