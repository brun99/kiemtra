
package Bai_2_Composite_1;

import java.util.ArrayList;
import java.util.List;


public class Mon extends AbstractKhoa{
    List<AbstractKhoa> mon = new ArrayList<>(); 

    public Mon(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractKhoa k) {
        if(mon.contains(k))// so sánh nếu có môn đó thì k in ra
            return;
        mon.add(k);
       k.path =  getPath()+"//"+k.path;
       k.prefix =  this.prefix + "  ";
    }

    @Override
    public void remove(AbstractKhoa k) {
        if(mon.contains(k)){//nếu có thì xóa 
            mon.remove(k);
            return;
        }
        for(AbstractKhoa khoa: mon )
            khoa.remove(k);       
    }

    @Override
    public String getTreeMon() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractKhoa k : mon) {
            builder.append("\n")
                    .append(k.prefix)
                    .append(k.getTreeMon());
        }
        return builder.toString();
    }
    
}
