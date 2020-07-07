
package Bai_1_Factory_Singleton;


public abstract class Shape {
    String brush, paper, frame;

    public Shape() {
    }
    
    
    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public abstract String draw();
    
}
