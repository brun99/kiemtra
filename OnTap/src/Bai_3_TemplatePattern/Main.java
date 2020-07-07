
package Bai_3_TemplatePattern;


public class Main {
    public static void main(String[] args) {
        EntityDB sv = new SinhVienDB();
        sv.add(new SinhVien(59130221, "phạm văn cường", "10-05-1999", "ninh hòa"));
        sv.add(new SinhVien(59130222, "phạm xuân thái", "10-05-1998", "nha trang"));
        sv.add(new SinhVien(59130223, "phạm hoàng dịu", "10-05-1996", "vạn giã"));
        System.out.println("danh sách sinh viên:");
        sv.show();
        
        sv.deleteByKey(59130223);
        System.out.println("Xóa sinh viên có id=59130223");
        sv.show();
        
        sv.update(new SinhVien(59130222, "phạm xuân thái", "10-05-1998", "ninh thuận"));
        System.out.println("chỉnh sửa sinh viên id= 59130222");
        sv.show();
    }
}
