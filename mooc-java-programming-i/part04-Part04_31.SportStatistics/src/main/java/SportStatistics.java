
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Game> games = new ArrayList<>();
        
        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                String game = read.nextLine();
                String[] stats = game.split(",");
                
                String home = stats[0];
                String away = stats[1];
                int homeScore = Integer.valueOf(stats[2]);
                int awayScore = Integer.valueOf(stats[3]);
                
                games.add(new Game(home, away, homeScore, awayScore));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String toFind = scan.nextLine();
        
        int ctr = 0;
        int win = 0;
        for (Game game: games) {
            String homeTeam = game.getHome();
            String awayTeam = game.getAway();
            
            if (homeTeam.equals(toFind)) {
                ctr++;
                if (game.homeWin()) {
                    win++;
                }
            }
            
            if(awayTeam.equals(toFind)) {
                ctr++;
                if (game.awayWin()) {
                    win++;
                }
            }     
        }
        int loss = ctr - win;
        
        System.out.println("Games: " + ctr);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        
        
    }
}    
