
package Bai_3_4_ChainOfResponsibilty;


public class ChuTich {
    int khoanVay, hanMuc;
    String ten;

    public ChuTich(int khoanVay, int hanMuc, String ten) {
        this.khoanVay = khoanVay;
        this.hanMuc = hanMuc;
        this.ten = ten;
    }
    

    public boolean kiemTra(){
        return (khoanVay < hanMuc);
    }
    public void duyet(){
        if (kiemTra()) {
            StringBuilder builder = new StringBuilder();
            builder.append("chủ tịch :")
                    .append(ten)
                    .append("đã được duyêt!!");
            System.out.println(builder.toString());
        }
        else{
            System.out.println("k duyệt!!");
            
        }
    }
    
}
