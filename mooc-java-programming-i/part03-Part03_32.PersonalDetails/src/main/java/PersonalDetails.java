
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longest = "";
        int sum = 0;
        int ctr = 0;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] details = text.split(",");
            
            if (details[0].length() > longest.length()) {
                longest = details[0];
            }
            
            sum += Integer.valueOf(details[1]);
            ctr++;
        }
        
        double avg = 1.0 * sum / ctr;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years:" + avg);
    }
}
