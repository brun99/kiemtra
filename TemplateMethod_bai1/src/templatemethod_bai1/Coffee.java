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
public class Coffee extends CaffeineBeverage{

    @Override
    protected void brew() {
      System.out.println("brew coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("add milk and sugar");
    }
    
}
