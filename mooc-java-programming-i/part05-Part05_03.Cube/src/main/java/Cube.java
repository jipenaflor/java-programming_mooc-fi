/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
public class Cube {
    
    private int s;
    
    public Cube(int edgeLength) {
        this.s = edgeLength;

    }
    
    public int volume() {
        return s * s * s;
    }
    
    @Override
    public String toString() {
        return "The length of edge is " + this.s + " and the volume " + volume();
    }
    
}
