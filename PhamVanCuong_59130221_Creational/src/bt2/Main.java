/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Cuong Pham
 */
public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStr = new MyStringBuilder.Builder()
                .addString("\nPham Van Cuong")
                .addString("\nĐiểm:")
                .addFloat((float)7.5)
                .addString("\nNam:")
                .addBool(true)
                .Builder();
        System.out.println(myStr.toString());
                
    }
}
