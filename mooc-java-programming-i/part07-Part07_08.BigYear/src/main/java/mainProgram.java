
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            // Adds a bird
            if (command.equals("Add")) {
                add(scan, birds);
            }
            // Adds an observation
            if (command.equals("Observation")) {
                observe(scan, birds);
            }
            // Prints all birds
            if (command.equals("All")) {
                printAll(birds);
            }
            // Prints one bird
            if (command.equals("One")) {
                printOne(scan, birds);
            }
        }

    }

    public static void add(Scanner scan, ArrayList<Bird> birds) {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latin = scan.nextLine();
        birds.add(new Bird(name, latin));
    }

    public static void observe(Scanner scan, ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String bird = scan.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(bird)) {
                b.observed();
                break;
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public static void printAll(ArrayList<Bird> birds) {
        for (Bird b: birds) {
            System.out.println(b);
        }
    }
    
    public static void printOne(Scanner scan, ArrayList<Bird> birds) {
        System.out.print("Bird? ");
        String bird = scan.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(bird)) {
                System.out.println(b);
            }
        }
    }

}
