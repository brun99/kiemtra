/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_4_ChainOfResponsibilty;


public class GiamDoc {
int khoanVay, hanMuc;
    String ten;
    ChuTich chuTich;

    public GiamDoc(int khoanVay, int hanMuc, String ten, ChuTich chuTich) {
        this.khoanVay = khoanVay;
        this.hanMuc = hanMuc;
        this.ten = ten;
        this.chuTich = chuTich;
    }
    

    

    public boolean kiemTra(){
        return (khoanVay < hanMuc);
    }
    public void duyet(){
        if (kiemTra()) {
            StringBuilder builder = new StringBuilder();
            builder.append("Giám đốc :")
                    .append(ten)
                    .append("đã được duyêt!!");
            System.out.println(builder.toString());
        }
        else{
            System.out.println("chuyển lên chủ tịch!!");
            chuTich.duyet();
        }
    }
    
}
