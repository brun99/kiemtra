/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3_Interator;

/**
 *
 * @author Cuong Pham
 */
public class ConcreteIterator extends Iterator{
    ConcreteAggregate A;
    int i;

    public ConcreteIterator(ConcreteAggregate A) {
        this.A = A;
        this.i = 0;
    }
    

    @Override
    public int frist() {
        this.i = 0;
        return A.getItem(i);
    }

    @Override
    public int next() {
        if (!this.isDone()) {
            this.i += 1;
            return A.getItem(i);
        }
        return this.currentItem();
    }

    @Override
    public boolean isDone() {
       return this.i == A.count() - 1;
    }

    @Override
    public int currentItem() {
        return A.getItem(i);
    }
    
}
