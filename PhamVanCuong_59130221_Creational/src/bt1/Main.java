/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        HoaDonHeader hdh = new HoaDonHeader("HD001","Pham Van Cuong", new SimpleDateFormat("dd/mm/yyyy").parse("10/05/1999"));
        CTHD cthd1 = new CTHD("tai nghe",1,90000,0.02);
        CTHD cthd2 = new CTHD("dây sạc iphone",2,300000,0.5);
        
        HoaDon hd = new HoaDon.Builder()
                .addHoaDonHeader(hdh)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .builder();
        System.out.println(hd.toString());
        
    }
}
