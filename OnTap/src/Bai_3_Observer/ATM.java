
package Bai_3_Observer;

//subject
public class ATM {
    ATM_Observer observer;

    public ATM() {
    }

    public void thietLapTK(ATM_Observer observer){
        this.observer = observer;
    }
    
    private boolean kiemTraTienRut(int tientrut){
        return observer.KiemTraSoDu(tientrut);
    }
    public void rutTien(int tientrut){
        if(kiemTraTienRut(tientrut))
            observer.nhanThongBao(tientrut, " giao dịch thành công");
        else
            observer.nhanThongBao(tientrut, "giao dich không thành công");
    }
    
    public static interface ATM_Observer{
        boolean KiemTraSoDu(int tientrut);
        void nhanThongBao(int tientrut, String thongBao);
    }
}
