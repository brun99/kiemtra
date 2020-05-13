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
public class ShapeFactory {
    ShapeType type;

    public void setType(ShapeType type) {
        this.type = type;
    }
    
    public ShapeFactory() {
    }

    private static ShapeFactory instance;

    public static ShapeFactory createInstance(){
        if(instance==null)
            instance= new ShapeFactory();
        return instance;
    }
    
    public Shape createShape() {
        switch(type)
        {
            case Circle: return new Circle();
            case Triangle: return new Triangle();
            case Rectandle: return new Rectangle();
        }
        return null;
    }
    
    
}
