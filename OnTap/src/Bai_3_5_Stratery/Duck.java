/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_5_Stratery;

/**
 *
 * @author Cuong Pham
 */
public abstract class Duck {
    IFly ifly;
    IQuack iQuack;

    public Duck() {
    }
    

    public Duck(IFly fly, IQuack iQuack) {
        this.ifly = fly;
        this.iQuack = iQuack;
    }

    public void setFly(IFly fly) {
        this.ifly = fly;
    }

    public void setiQuack(IQuack iQuack) {
        this.iQuack = iQuack;
    }
    
    public String performQuack(){
        return iQuack.quack();
    }
    public String performFly(){
        return ifly.iFly();
    }
    
    public String Swim(){
        return "vịt bơi trong ao";
    }
    public abstract String Display();
}
