
package Bai_2_Composite_1;


public class Main {
    public static void main(String[] args) {
//        AbstractKhoa khoa1 = new Mon("Công nghệ thông tin");
//        AbstractKhoa mon1 = new Mon("nhập môn lập trình");
//        AbstractKhoa GV1 = new GiangVien("đoàn vũ thịnh");
//        AbstractKhoa mon2 = new Mon("database");
//        AbstractKhoa GV2 = new GiangVien("Thầy thuần");
//        
//         AbstractKhoa khoa2 = new Mon("kế toán");
//        AbstractKhoa mon3 = new Mon("kinh tế vi mô");
//        AbstractKhoa GV3 = new GiangVien("cô A");
//        AbstractKhoa mon4 = new Mon("quản lí tài chính");
//        AbstractKhoa GV4 = new GiangVien("thầy B");
//        
//        khoa1.add(mon1);
//        mon1.add(GV1);
//        khoa1.add(mon2);
//        mon2.add(GV2);
//        
//        khoa2.add(mon3);
//        mon3.add(GV3);
//        khoa2.add(mon4);
//        mon4.add(GV4);
//        
//        System.out.println(khoa1.getTreeMon());
//        System.out.println(mon1.getPath());
//        System.out.println(mon2.getPath());
//        
//        System.out.println(khoa2.getTreeMon());
//        System.out.println(mon3.getPath());
//        System.out.println(mon4.getPath());
//        
//        System.out.println("remove");
//        
//        khoa2.remove(mon3);
//        
//        System.out.println(khoa2.getTreeMon());

        AbstractKhoa khoa1 = new Khoa("CNTT");
        AbstractKhoa boMon1 = new Mon("cơ sở dữ liệu");
        AbstractKhoa boMon2 = new Mon("vật lý đại cương");
        AbstractKhoa boMon3 = new Mon("giải tích");
        AbstractKhoa giangVien1 = new GiangVien("cường");
        AbstractKhoa giangVien2 = new GiangVien("thái");
        
        
        khoa1.add(boMon1);
        boMon1.add(giangVien1);
        khoa1.add(boMon2);
        boMon2.add(giangVien2);
        
        
        System.out.println(khoa1.getTreeMon());
        System.out.println(giangVien1.getPath());
        System.out.println(giangVien2.getPath());
        
        System.out.println("remove \n");
//        khoa1.remove(boMon2);
        
        boMon2.remove(giangVien2);
        
        System.out.println(khoa1.getTreeMon());
        System.out.println(giangVien1.getPath());
        
        
    }
}
