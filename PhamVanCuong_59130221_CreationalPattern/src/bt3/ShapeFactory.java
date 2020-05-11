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

    protected Shape createShape(ShapeType type) {
        switch(type)
        {
            case Circle: return Circle.createCircle();
            case Triangle: return Triangle.createTriangle();
            case Rectandle: return Rectangle.createRectangle();
        }
        return null;
    }
    
    
}
