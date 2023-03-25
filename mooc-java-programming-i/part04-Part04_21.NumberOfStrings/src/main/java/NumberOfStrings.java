
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ctr = 0;
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            }
            
            ctr++;
        }
        
        System.out.println(ctr);
    }
}
