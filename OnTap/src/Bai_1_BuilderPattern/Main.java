
package Bai_1_BuilderPattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) throws ParseException {
        HoaDonHeader hdh = new HoaDonHeader("HD01", "Văn Cường", new SimpleDateFormat("dd/MM/yyyy").parse("30/6/2020"));
        CTHD cthd  = new CTHD("tai phone", 2, 100000,(float) 0.9);
        
        HoaDon don = new HoaDon.Builder()
                .addHoaDonHeader(hdh)
                .addCTHD(cthd)
                .builder();
        System.out.println(don);
    }
}
