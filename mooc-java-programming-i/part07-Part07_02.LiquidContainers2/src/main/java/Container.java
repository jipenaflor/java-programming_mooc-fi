/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
public class Container {
    
    private int container;
    
    public Container() {
        this.container = 0;
    }
    
    public int contains() {
        return this.container;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.container += amount;
            if (contains() > 100) {
                this.container = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.container -= amount;
            if (contains() < 0) {
                this.container = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return contains() + "/100";
    }
}
