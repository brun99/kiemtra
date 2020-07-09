package kt591_phamvancuong_59130221;

public class ThongBao {
    String TieuDe, icon, noidung, ungdung;

    public ThongBao(String TieuDe, String icon, String noidung, String ungdung) {
        this.TieuDe = TieuDe;
        this.icon = icon;
        this.noidung = noidung;
        this.ungdung = ungdung;
    }
    
    protected ThongBao(Builder builder){
        this.TieuDe = builder.TieuDe;
        this.icon = builder.icon;
        this.noidung = builder.noidung;
        this.ungdung = builder.ungdung;
    }

    public static class Builder{
        String TieuDe, icon, noidung, ungdung;
        
        private static Builder instance = new Builder();//khai báo singleton để sử dụng cho lớp Builder
        
        public static Builder createbuilder(){
            if (instance == null) {
                instance = new Builder();
            }
            return instance;
        }
        
        public Builder addTieuDe(String tieuDe){
            //thay instance cho this
            instance.TieuDe = tieuDe;
            return this;
        }
        
        public Builder addIcon(String icon){
            instance.icon = icon;
            return this;
        }
        
        public Builder addNoiDung(String noiDung){
            instance.noidung = noiDung;
            return this;
        }
        
        public Builder addUngDung(String ungDung){
            instance.ungdung = ungDung;
            return this;
        }
        
        public ThongBao builder(){
            return new ThongBao(instance);
        }
     
    }
  
    public String HienThi() {
        return "ThongBao{" + "TieuDe=" + TieuDe + ", icon=" + icon + ", noidung=" + noidung + ", ungdung=" + ungdung + '}';
    }
    
}
