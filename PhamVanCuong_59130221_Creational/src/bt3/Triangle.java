/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Cuong Pham
 */
public class Triangle extends Shape{

    private static Triangle instance;
    int count;

    public Triangle() {
    }
    
    
    public static Triangle createTriangle(){
        if(instance==null)
            instance= new Triangle();
        return instance;
    }
    public int getCount(){
         return count;
     }
     
     public void setCount(int count){
         this.count = count;
     }
    @Override
    public String draw() {
        return "hình tam giác:";
    }
    
}
