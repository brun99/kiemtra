
package Bai_1_Factory_Singleton;

public class Rectangle extends Shape{

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }


    @Override
    public String draw() {
       return "Vẽ hình chữ nhật :" + brush + paper + frame;
    }
    
}
