
package Bai_1_Factory_Singleton;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("---------Factory-------");
        ShapeFactory factory = new ShapeFactory();
        Shape sf1 = factory.createShape(ShapeType.Circle);
        Shape sf2 = factory.createShape(ShapeType.Reactangle);
        Shape sf3 = factory.createShape(ShapeType.Triangle);
        System.out.println(sf1.draw());
        System.out.println(sf2.draw());
        System.out.println(sf3.draw());
        
        System.out.println("--------Singleton--------");
        
        
        ShapeSingleton s1 = ShapeSingleton.Instance();
        ShapeSingleton s2 = ShapeSingleton.Instance();
        ShapeSingleton s3 = ShapeSingleton.Instance();
        
        s1.setType(ShapeType.Circle);
        Shape h1 = s1.createShapeType();
        System.out.println(h1.draw());
        
        s2.setType(ShapeType.Reactangle);
        Shape h2 = s2.createShapeType();
        h1 = s1.createShapeType();
        System.out.println(h1.draw());
        System.out.println(h2.draw());
        
        s3.setType(ShapeType.Circle);
        Shape h3 = s3.createShapeType();
        h1 = s1.createShapeType();
        h2 = s2.createShapeType();
        System.out.println(h1.draw());
        System.out.println(h2.draw());
        System.out.println(h3.draw());
        
       
        
    }
}
