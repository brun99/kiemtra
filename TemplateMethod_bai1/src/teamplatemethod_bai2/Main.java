/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamplatemethod_bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) {
        List<product> list = new ArrayList<>();
        list.add(new product("A", 10, 10));
        list.add(new product("C", 5, 10));
        list.add(new product("D", 20, 10));
        list.add(new product("B", 15, 10));
    
    SortCollection<product> sort1 = new SortProductByName();
    sort1.sort(list);
    
    System.out.println("sắp xếp theo tên: \n");
    for(int i = 0 ; i < list.size(); i++)
        System.out.println(list.get(i).getName()+"|" + list.get(i).getPrice() + "|" + list.get(i).getQuanlity()+"\n");
        
    SortCollection<product> sort2 = new SortProductByPrice();
    sort2.sort(list);
    
    System.out.println("sắp xếp theo giá: \n");
    for(int i = 0 ; i < list.size(); i++)
            System.out.println(list.get(i).getName()+"|" + list.get(i).getPrice() + "|" + list.get(i).getQuanlity()+"\n");
        
    }
    
}
