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
        
        //hình tròn 
        Shape s1 = sf.createShape(ShapeType.Circle);
        s1.setCount(10);
        System.out.println("giá trị count của hình tròn :" + s1.getCount());
        
        //hình tam giác
        Shape s2 = sf.createShape(ShapeType.Rectandle);
        s2.setCount(20);
        System.out.println("giá trị count của tam giác :" + s2.getCount());
        
        //hình chữ nhật 
        Shape s3 = sf.createShape(ShapeType.Triangle);
        s3.setCount(30);
        System.out.println("giá trị count của hình chữ nhật :" + s3.getCount());
    }
}
