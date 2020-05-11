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
public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        
        Shape s1 = sf.createShape(ShapeType.Circle);
        
        
    }
}
