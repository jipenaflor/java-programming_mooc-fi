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

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int weight;
    
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }
    
    public void addItem(Item item) {
        this.weight += item.getWeight();
        if (this.weight <= this.maxWeight) {
            this.items.add(item);
        } else {
            this.weight -= item.getWeight();
        } 
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        return this.weight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item i: items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.weight + " kg)";
        } else {
            return this.items.size() + " items (" + this.weight + " kg)";
        }
    }
}
