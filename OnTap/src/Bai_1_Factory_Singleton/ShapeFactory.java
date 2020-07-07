package Bai_1_Factory_Singleton;

public class ShapeFactory {
    ShapeType type;

    
    public ShapeFactory() {
    }
   
    public Shape createShape(ShapeType shapeType) {
        switch(shapeType)
        {
            case Circle: return new Circle("Bút lông,", "A4,", "Khung Gỗ");
            case Triangle: return new Triangle("Bút  chì,", "A3,", "Khung Gỗ");
            case Reactangle: return new Rectangle("Bút lông đỏ,", "A2,", "Khung Gỗ");
        }
        return null;
    }
}
