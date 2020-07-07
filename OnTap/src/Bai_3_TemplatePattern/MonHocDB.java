
package Bai_3_TemplatePattern;

public class MonHocDB extends  EntityDB<MonHoc>{

    @Override
    MonHoc findById(int id) {
        for (MonHoc monHoc : list) {
            if (monHoc.getMaMH() == id)
                return  monHoc;
        }
        return null;
    }

    @Override
    int getKey(MonHoc t) {
        return t.getMaMH();
    }

    @Override
    void show() {
        for (MonHoc monHoc : list) {
            System.out.println(monHoc.toString());
        }
    }
    
}
