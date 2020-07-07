/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamplatemethod_bai2;

/**
 *
 * @author Cuong Pham
 */
public class product {
    String name;
    int price;
    int quanlity;

    public product(String name, int price, int quanlity) {
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
    
    
}
