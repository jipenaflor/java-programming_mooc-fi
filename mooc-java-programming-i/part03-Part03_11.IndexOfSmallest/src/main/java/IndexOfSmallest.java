
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            
            numbers.add(num);
        }
        
        // after that, the program prints the smallest number
        int size = numbers.size();
        int smallest = numbers.get(0);
        
        for (int i = 0; i < size; i++) {
            if (smallest > numbers.get(i)) {
                smallest = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        // and its index -- the smallest number
        // might appear multiple times
        for (int j = 0; j < size; j++) {
            if (smallest == numbers.get(j)) {
                System.out.println("Found at index: " + j);
            }
        }

        
    }
}
