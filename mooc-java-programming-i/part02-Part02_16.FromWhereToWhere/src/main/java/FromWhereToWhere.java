
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int to = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int from = Integer.valueOf(scanner.nextLine());
        
        int ctr = from;
        while (true) {
            if (ctr > to) {
                break;
            } else {
                System.out.println(ctr);
                ctr++;
                //continue;
            }
            
        }
    }
}
