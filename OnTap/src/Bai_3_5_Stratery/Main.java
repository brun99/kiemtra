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
public class Main {
    public static void main(String[] args) {
        Duck d = new MallarDuck();
        d.setFly(new Flly());
        d.setiQuack(new Quack());
        System.out.println(d.Display());
    }
    
}
