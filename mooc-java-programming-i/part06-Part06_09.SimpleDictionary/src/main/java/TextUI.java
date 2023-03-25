/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.print("Command: ");

        while (true) {
            String command = scanner.nextLine();

            if (isEnd(command)) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public boolean isEnd(String command) {
        return command.equals("end");
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();

        if (dictionary.translate(word) != null) {
            System.out.println("Translation: " + dictionary.translate(word));
        } else {
            System.out.println("Word " + word + " was not found.");
        }

    }

}
