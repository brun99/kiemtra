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
        HoaDonHeader HD = new HoaDonHeader("HD001", new SimpleDateFormat("dd/mm/yyyy").parse("10/05/1999"), "Pham Van Cuong" );
        
    }
}
