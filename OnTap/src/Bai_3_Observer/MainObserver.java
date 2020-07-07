
package Bai_3_Observer;


public class MainObserver {
    public static void main(String[] args) {
        int tienrut = 400;
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(1000);
        
        atm.thietLapTK(taiKhoan);
        atm.rutTien(tienrut);
        
    }
    
    
   
    
    
    
    
    
}
