/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
public class Timer {
    
    private ClockHand sec;
    private ClockHand hundredSec;
    
    public Timer() {
        this.sec = new ClockHand(60);
        this.hundredSec = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredSec.advance();
        
        if (this.hundredSec.value() == 0) {
            this.sec.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.sec + ":" + this.hundredSec;
    }
}
