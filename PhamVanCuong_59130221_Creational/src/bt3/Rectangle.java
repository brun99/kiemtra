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
public class Rectangle extends Shape{

    public Rectangle() {
        brush += "vẽ hình chữ nhật \n";
    }

    @Override
    public String draw() {
        brush += "bút chì \n";
        paper += "giấy ô ly \n";
        frame += "khung gỗ";
        return brush + paper + frame;
    }
    
}
