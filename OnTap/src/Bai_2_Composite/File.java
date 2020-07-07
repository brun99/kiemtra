
package Bai_2_Composite;


public class File extends  AbstractFile{

    public File(String name) {
        super(name);
    }
    

    @Override
    public void add(AbstractFile f) {
    }

    @Override
    public void remove(AbstractFile f) {
    }

    @Override
    public String getTreeFolder() {
        return name;
    }
    
}
