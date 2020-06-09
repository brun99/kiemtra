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
public class TemplateMethod_bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("coffee:");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        
        System.out.println("Tea:");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        
        
    }
    
}
