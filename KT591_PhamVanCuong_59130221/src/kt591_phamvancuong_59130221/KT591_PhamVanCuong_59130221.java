package kt591_phamvancuong_59130221;

public class KT591_PhamVanCuong_59130221 {

    public static void main(String[] args) {
        
        System.out.println("Câu 1:");
        ThongBao thongBao1 = new ThongBao.Builder()
                .addTieuDe("thông báo")
                .addIcon("đường dẫn icon")
                .addNoiDung("nội dung của thông báo")
                .addUngDung("ứng dụng gửi thông báo")
                .builder();
        System.out.println(thongBao1.HienThi());
              
        System.out.println("Câu 2:");      
        ThongBao thongBao2 = new ThongBao.Builder()
                .addTieuDe("mẫu thiết kế")
                .addIcon("đường dẫn icon")
                .addNoiDung("mang theo laptop")
                .addUngDung("Git")
                .builder();
        System.out.println(thongBao2.HienThi());
        
        ThongBao thongBao = new ThongBao.Builder().builder();
        System.out.println(thongBao.HienThi());
    }
    
}
