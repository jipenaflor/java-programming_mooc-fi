
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        
        int sum = first + sec;
        System.out.println(first + " + " + sec + " = " + sum);


    }
}
