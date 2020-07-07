
package Bai_3_4_ChainOfResponsibilty;

public class PhoTruongPhong {
    int khoanVay, hanMuc;
    String ten;
    TruongPhong capTren;

    public PhoTruongPhong(int khoanVay, int hanMuc, String ten, TruongPhong capTren) {
        this.khoanVay = khoanVay;
        this.hanMuc = hanMuc;
        this.ten = ten;
        this.capTren = capTren;
    }

    public boolean kiemTra(){
        return (khoanVay < hanMuc);
    }
    public void duyet(){
        if (kiemTra()) {
            StringBuilder builder = new StringBuilder();
            builder.append("phó trưởng phòng :")
                    .append(ten)
                    .append("đã được duyêt!!");
            System.out.println(builder.toString());
        }
        else{
            System.out.println("chuyển lên trưởng phòng!!");
            capTren.duyet();
        }
    }
    
}
