/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamplatemethod_bai2;

import java.util.List;

/**
 *
 * @author Cuong Pham
 */
public class SortProductByPrice extends SortCollection<product>{

    @Override
    protected int compare(product t1, product t2) {
        if(t1.getPrice() == t2.getPrice())
            return 0;
        else
        {
            if(t1.getPrice() > t2.getPrice())
                return 1;
            else
                return -1;
        }
    }
    
}
