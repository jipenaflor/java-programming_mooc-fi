
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ctr = 0;
        int num;
        
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num < 0) {
                ctr += 1;
            }
        }
        
        System.out.println("Number of negative numbers: " + ctr);
    }
}
