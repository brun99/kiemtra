/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2_Composite;

import java.util.List;
import java.util.ArrayList;


public class Folder extends  AbstractFile{
    List<AbstractFile> file = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractFile f) {
        if(file.contains(f))// so sánh nếu giống thì in ra không
            return;
        file.add(f);
        f.path =  getpath()+ "\\" + f.path;
        f.prefix =  this.prefix + "  ";
    }

    @Override
    public void remove(AbstractFile f) {
        if (file.contains(f)) {
            file.remove(f);
            return;
        }
        for(AbstractFile folder: file)
            folder.remove(f);
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractFile f : file) {
            builder.append("\n")
                    .append(f.prefix)
                    .append(f.getTreeFolder());
        }
        return builder.toString();
    }
    
}
