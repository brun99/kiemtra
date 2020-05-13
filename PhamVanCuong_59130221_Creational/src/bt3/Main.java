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
        ShapeFactory SF = ShapeFactory.createInstance();
        
        SF.setType(ShapeType.Circle);
        Shape s1 = SF.createShape();
        System.out.println("hình 1:" + s1.draw());
        
        SF.setType(ShapeType.Rectandle);
        Shape s2 = SF.createShape();
        System.out.println("hình 2:" + s2.draw());
        
        SF.setType(ShapeType.Triangle);
        Shape s3 = SF.createShape();
        System.out.println("hình 3:" + s3.draw());
    }
}
