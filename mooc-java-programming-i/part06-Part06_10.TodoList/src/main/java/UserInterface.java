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

public class UserInterface {
    
    private TodoList todo;
    private Scanner scanner;
    
    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.todo.add(toAdd);
            }
            
            if (command.equals("list")) {
                this.todo.print();
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                String toRemove = scanner.nextLine();
                int index = Integer.valueOf(toRemove);
                this.todo.remove(index);
            }
        }
    }
}
