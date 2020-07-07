
package Bai_1_Factory_Singleton;


public class Triangle extends Shape{

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tam giác: " + brush + paper + frame;
    }
    
}
