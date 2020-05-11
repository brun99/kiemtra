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
public class Circle extends Shape{
    
    private static Circle instance;
    int count;

    public Circle() {
    }
    
    
    public static Circle createCircle(){
        if(instance==null)
            instance= new Circle();
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
        return "hình tròn:";
    }
    
}
