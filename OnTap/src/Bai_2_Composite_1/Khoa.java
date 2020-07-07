/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2_Composite_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cuong Pham
 */
public class Khoa extends AbstractKhoa {
    List<AbstractKhoa> boMon = new ArrayList<>();

    public Khoa(String name) {
        super(name);
    }
    
    
    @Override
    public void add(AbstractKhoa k) {
            if(boMon.contains(k))// so sánh nếu có môn đó thì k in ra
            return;
        boMon.add(k);
       k.path =  getPath()+"//"+k.path;
       k.prefix =  this.prefix + "  ";
    }

    @Override
    public void remove(AbstractKhoa k) {
        if(boMon.contains(k)){//nếu có thì xóa 
             boMon.remove(k);
            return;
        }
        for(AbstractKhoa khoa: boMon )
            khoa.remove(k);
    }

    @Override
    public String getTreeMon() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractKhoa k : boMon) {
            builder.append("\n")
                    .append(k.prefix)
                    .append(k.getTreeMon());
        }
        return builder.toString();
    }
    
}
