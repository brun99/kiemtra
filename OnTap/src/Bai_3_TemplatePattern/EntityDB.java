/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_TemplatePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cuong Pham
 */
public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();
    
     abstract T findById(int id);
     abstract int getKey(T t);
    
    abstract void show();
    
    public boolean add(T t){
        int id = getKey(t);
        T t1 = findById(id);
        if(t1 == null){
            list.add(t);
            return true;
        }
        else
            return false;
    }
    public int update(T t){
         int id = getKey(t);
        T t1 = findById(id);
        if (t1 == null) {
            return 0;
        }
       int index = list.indexOf(t);
       list.set(index, t);
       return 1;
    }
    
    public int delete(T t){
         int id = getKey(t);
        T t1 = findById(id);
        if (t1 == null) {
            return 0;
        }
        list.remove(t);
        return 1;
    }
    
    public int deleteByKey(int id){
        T t1 = findById(id);
        if (list.remove(t1)) {
            return 1;
        }
        return 0;
    }
}
