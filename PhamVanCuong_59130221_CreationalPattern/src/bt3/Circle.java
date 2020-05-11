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

    public static Circle createCircle(){
        if(instance==null)
            instance= new Circle();
        return instance;
    }

    @Override
    public String draw() {
        return "hình tròn:";
    }
    
}
