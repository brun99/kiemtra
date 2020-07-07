
package Bai_2_Composite_1;


public abstract class AbstractKhoa {
    String name, path;
    String prefix = " ";

    public AbstractKhoa(String name) {
        this.name = name;
        this.path = name;
    }
    
    public abstract void add(AbstractKhoa k);
    public abstract void remove(AbstractKhoa k);
    public abstract String getTreeMon();

    public String getPath() {
        return name;
    }
}
