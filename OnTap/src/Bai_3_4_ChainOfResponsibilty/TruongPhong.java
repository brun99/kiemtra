
package Bai_3_4_ChainOfResponsibilty;


class TruongPhong {
    int khoanVay, hanMuc;
    String ten;
    GiamDoc giamDoc;

    public TruongPhong(int khoanVay, int hanMuc, String ten, GiamDoc giamDoc) {
        this.khoanVay = khoanVay;
        this.hanMuc = hanMuc;
        this.ten = ten;
        this.giamDoc = giamDoc;
    }
    
    public boolean kiemTra(){
        return (khoanVay < hanMuc);
    }
    public void duyet(){
        if (kiemTra()) {
            StringBuilder builder = new StringBuilder();
            builder.append("trưởng phòng :")
                    .append(ten)
                    .append("đã được duyêt!!");
            System.out.println(builder.toString());
        }
        else{
            System.out.println("chuyển lên Giám đốc!!");
            giamDoc.duyet();
        }
    }
    
}
