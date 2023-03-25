/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */

import java.util.ArrayList;

public class Hold {
    
    private ArrayList<Suitcase> cases;
    private int maxWeight;
    private int weight;
    
    public Hold(int maxWeight) {
        this.cases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        this.weight += suitcase.totalWeight();
        if (this.weight <= this.maxWeight) {
            this.cases.add(suitcase);
        } else {
            this.weight -= suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase c: cases) {
            c.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.cases.size() + " suitcases (" + this.weight + " kg)";
    }
    
    
    
}
