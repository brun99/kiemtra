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
public abstract class Shape {
     String brush, paper, frame;
     int count;
     
    public int getCount(){
         return count;
    }
     
    public void setCount(int count){
        this.count = count;
    }
    public abstract String draw();
}
