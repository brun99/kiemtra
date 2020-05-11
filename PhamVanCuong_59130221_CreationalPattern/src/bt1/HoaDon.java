/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import bt2.MyStringBuilder.Builder;
import java.util.ArrayList;

/**
 *
 * @author Cuong Pham
 */
public class HoaDon {
    HoaDonHeader hdh;
    ArrayList<CTHD> ds = new ArrayList<>();
    
    protected HoaDon(Builder builder){
        this.hdh = builder.hdh;
        this.ds = builder.ds;
    }

    
    public static class Builder{
        HoaDonHeader hdh;
        ArrayList<CTHD> ds = new ArrayList<>();
       
        
        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hdh){
            this.hdh = hdh;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.ds.add(cthd);
            return this;
        }
        
        public HoaDon builder(){
            return new HoaDon(this);
        }     
    }
    @Override
    public String toString(){
        String s = hdh.toString();
        for(int i=0; i<ds.size(); i++){
            s +=ds.get(i).toString();
        }
        return s;
    }
    
    
}
