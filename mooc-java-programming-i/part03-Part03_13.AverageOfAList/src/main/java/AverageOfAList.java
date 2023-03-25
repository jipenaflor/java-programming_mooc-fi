
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            
            numbers.add(num);
        }
        
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        int ctr = 0;
        for (Integer num: numbers) {
            sum += num;
            ctr++;
        }
        
        double avg = (double) sum / ctr;
        System.out.println("Average: " + avg);
    }
}
