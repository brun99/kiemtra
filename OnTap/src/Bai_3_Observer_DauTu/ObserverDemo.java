/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_Observer_DauTu;

import java.util.Scanner;

/**
 *
 * @author Cuong Pham
 */
public class ObserverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiGia tg = new TiGia(100);
        NhaDauTuA dauTuA = new NhaDauTuA();
        NhaDauTuB dauTuB = new NhaDauTuB();
        
        dauTuA.dangky(tg);
        dauTuB.dangky(tg);
        
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("nhap khoang tay doi ti gia: ");
            float delta = 0;
            delta = s.nextFloat();
            tg.thayDoiTiGia(delta);
            System.out.println("tiep tuc : \t");
            String confirm = s.next();
            if(confirm.equalsIgnoreCase("n"))
                break;
        }
    }
    
}
