
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int oldest = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            
            String[] details = text.split(",");
            if (oldest < Integer.valueOf(details[1])) {
                name = details[0];
                oldest = Integer.valueOf(details[1]);
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
