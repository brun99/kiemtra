
package Bai_2_Composite;

public class Main {
    public static void main(String[] args) {
        AbstractFile goc = new Folder("data");
        
        AbstractFile toan = new Folder("toán");
        AbstractFile toan1 = new Folder("giải tích");
        AbstractFile giaitich = new File("co so toan tin");
        AbstractFile toan2 = new Folder("đại số");
        AbstractFile daiso = new File("đại số tuyến tính");
        
        AbstractFile ly = new Folder("Lý");
        AbstractFile coHoc = new File("Cohoc.pdf");
        AbstractFile quanHoc = new File("quanhoc.pdf");
        
        AbstractFile hoa = new Folder("Hóa");
        AbstractFile danhSachSV = new File("danhsachSV.xlsx");
        
        goc.add(toan);
        
        toan.add(toan1);
        toan1.add(giaitich);
        
        toan.add(toan2);
        toan2.add(daiso);
        
        goc.add(ly);
        ly.add(coHoc);
        coHoc.add(quanHoc);
        
        goc.add(hoa);
        hoa.add(danhSachSV);
        
        System.out.println(goc.getTreeFolder());
        System.out.println(toan1.getpath());
        System.out.println(toan2.getpath());
        System.out.println(ly.getpath());
        System.out.println(coHoc.getpath());
        System.out.println(hoa.getpath());
        System.out.println(danhSachSV.getpath());
        
        System.out.println("remove \n");
        goc.remove(ly);
        System.out.println(goc.getTreeFolder());
    }
}
