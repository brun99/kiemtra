/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod_bai1;

/**
 *
 * @author Cuong Pham
 */
public abstract class CaffeineBeverage {
    
    public void prepareRecipe(){
       boilInWater();
       pourInCup();
       brew();
       addCondiments();
    }
    
    protected void boilInWater(){
        System.out.println("boil in water");
    }
    
    protected void pourInCup(){
        System.out.println("pour in cup");
    }
    
    protected abstract void brew();
    
    protected abstract void addCondiments();
    

}
