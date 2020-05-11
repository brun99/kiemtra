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
public class Rectangle extends Shape{

    private static Rectangle instance;
    int count;

    public Rectangle() {
    }
    
    
    public static Rectangle createRectangle(){
        if(instance==null)
            instance= new Rectangle();
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
