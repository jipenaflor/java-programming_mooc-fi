
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int first = Integer.valueOf(scanner.nextLine());
        int sec = Integer.valueOf(scanner.nextLine());
        int sum = first + sec;
        
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
        
        
    }
}
