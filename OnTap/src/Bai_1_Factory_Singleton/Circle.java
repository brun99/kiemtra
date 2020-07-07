
package Bai_1_Factory_Singleton;


public class Circle extends Shape{

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }


    @Override
    public String draw() {
       
        return "Vẽ hình tròn: " + brush + paper + frame;
    }
    
}
