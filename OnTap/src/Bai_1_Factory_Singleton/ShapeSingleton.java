/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1_Factory_Singleton;

/**
 *
 * @author Cuong Pham
 */
public class ShapeSingleton {
    
    ShapeType Type ;
    

    public ShapeType getType() {
        return Type;
    }

    public void setType(ShapeType Type) {
        this.Type = Type;
    }
    private static ShapeSingleton instance;
    
    public static ShapeSingleton Instance()
    {
    if( instance == null )
        instance = new ShapeSingleton();
       return instance;
    } 
    
    public Shape createShapeType() {
        switch(this.Type)
        {
            case Circle: return new Circle("Bút lông,", "A4,", "Khung Gỗ");
            case Triangle: return new Triangle("Bút  chì,", "A3,", "Khung Gỗ");
            case Reactangle: return new Rectangle("Bút lông đỏ,", "A2,", "Khung Gỗ");
        }
        return null;
    }
}
