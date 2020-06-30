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
public class Circle extends Shape{
     
    public Circle() {
        brush += "vẽ hình tròn \n";
    }

    @Override
    public String draw() {
        brush += "bút bi \n";
        paper += "giấy ô ly \n";
        frame += "khung tròn";
        return brush + paper + frame;
    }
    
}
