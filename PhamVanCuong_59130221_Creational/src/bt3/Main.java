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
        ShapeFactory hinh1 = ShapeFactory.createInstance();
        ShapeFactory hinh2 = ShapeFactory.createInstance();
        ShapeFactory hinh3 = ShapeFactory.createInstance();
        
        
        hinh1.setType(ShapeType.Circle);
        Shape h1 = hinh1.createShape();
        System.out.println("\n" + h1.draw());
        
        hinh2.setType(ShapeType.Rectandle);
        h1 = hinh1.createShape();
        Shape h2 = hinh2.createShape();
        System.out.println("\n" + h1.draw());
        System.out.println("\n" + h2.draw());
        
        hinh3.setType(ShapeType.Triangle);
        
        Shape h3 = hinh3.createShape();
        h1 = hinh1.createShape();
        h2 = hinh2.createShape();
        System.out.println("\n" + h1.draw());
        System.out.println("\n" + h2.draw());
        System.out.println("\n" + h3.draw());
        
        
    }
}
