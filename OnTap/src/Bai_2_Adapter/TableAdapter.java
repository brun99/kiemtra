
package Bai_2_Adapter;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class TableAdapter {
    //ArrayList<SinhVien> listSV;
    
    public static TableModel listAdapter(ArrayList<SinhVien> listSV){
        DefaultTableModel tableModel = null;
        Vector header = new Vector();
        header.add("Mã SV");
        header.add("tên");
        header.add("quê quán");
        header.add("ngày sinh");
        
        Vector data = new Vector();
        for(SinhVien sv: listSV){
            Vector row = new Vector();
            row.add(sv.maSV);
            row.add(sv.tenSV);
            row.add(sv.queQuan);
            row.add(sv.ngaySinh);
            data.add(row);
        }
        tableModel = new DefaultTableModel(data,header);
        return tableModel;
    }
}
