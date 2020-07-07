
package Bai_3_Observer;

import Bai_3_Observer.ATM.ATM_Observer;

public class TaiKhoan implements ATM.ATM_Observer{
    float soDu;

    public TaiKhoan() {
    }
    public void dangNhap(ATM t){
        t.thietLapTK((ATM.ATM_Observer) this);
    }

    public TaiKhoan(float soDu) {
        this.soDu = soDu;
    }
    
    @Override
    public boolean KiemTraSoDu(int tientrut) {
        return (this.soDu>=tientrut);            
    }

    @Override
    public void nhanThongBao(int tientrut, String thongBao) {
        System.out.println(thongBao);
        if(KiemTraSoDu(tientrut)){
            this.soDu -= tientrut;
            System.out.println("số dư còn lại :"+this.soDu);
        }
    }
    
}
