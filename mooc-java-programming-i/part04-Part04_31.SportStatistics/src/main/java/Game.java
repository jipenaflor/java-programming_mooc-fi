/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
public class Game {
    
    private String home;
    private String away;
    private int homeScore;
    private int awayScore;
    
    public Game(String home, String away, int homeScore, int awayScore) {
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHome() {
        return home;
    }
    
    public String getAway() {
        return away;
    }
    
    public boolean homeWin() {
        boolean win = false;
        if (this.homeScore > this.awayScore) {
            win = true;
        }    
        return win;
    }
    
    public boolean awayWin() {
        boolean win = false;
        if (this.homeScore < this.awayScore) {
            win = true;
        }    
        return win;
    }
}
