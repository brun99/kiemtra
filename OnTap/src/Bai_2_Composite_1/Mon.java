
package Bai_2_Composite_1;

import java.util.ArrayList;
import java.util.List;


public class Mon extends AbstractKhoa{
    List<AbstractKhoa> giangVien = new ArrayList<>(); 

    public Mon(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractKhoa k) {
        if(giangVien.contains(k))// so sánh nếu có môn đó thì k in ra
            return;
        giangVien.add(k);
       k.path =  getPath()+"//"+k.path;
       k.prefix =  this.prefix + "  ";
    }

    @Override
    public void remove(AbstractKhoa k) {
        if(giangVien.contains(k)){//nếu có thì xóa 
            giangVien.remove(k);
            return;
        }
        for(AbstractKhoa khoa: giangVien )
            khoa.remove(k);       
    }

    @Override
    public String getTreeMon() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractKhoa k : giangVien) {
            builder.append("\n")
                    .append(k.prefix)
                    .append(k.getTreeMon());
        }
        return builder.toString();
    }
    
}
