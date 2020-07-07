
package Bai_3_Interator;


public class DemoIterator {

    
    public static void main(String[] args) {
        ConcreteAggregate A = new ConcreteAggregate();
        Iterator i = A.createIterator();
        
        System.out.println("phần tử hiện đại :" + i.currentItem());
        System.out.println("phần tử tiếp theo :" + i.next());
        System.out.println("phần tử tiếp theo :" + i.next());
        System.out.println("phần tử tiếp theo :" + i.next());
        System.out.println("phần tử tiếp theo :" + i.next());
        System.out.println("phần tử tiếp theo :" + i.next());
        System.out.println("phần tử hiện đại :" + i.currentItem());
        
        System.out.println("phần tử đầu tiên :" + i.frist());
        
    }
    
}
