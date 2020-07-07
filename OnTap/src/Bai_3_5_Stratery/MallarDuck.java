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
public class MallarDuck extends Duck{

    @Override
    public String Display() {
        return "tôi là vịt trời " + "\n"+
                Swim()+ "\n" + 
                performFly()+"\n"+
                performQuack();
    }
    
}
