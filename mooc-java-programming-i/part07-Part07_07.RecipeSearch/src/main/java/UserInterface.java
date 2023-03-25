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

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            System.out.println("");
            
            if (command.equals("stop"))  {
                break;
            }
            // Listing recipes
            if (command.equals("list")) {
                System.out.println("Recipes:");
                list(this.recipes);
            }
            // Finding recipes by name
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String toSearch = scanner.nextLine();
                System.out.println("Recipes:");
                findName(this.recipes, toSearch);
            }
            // Searching for recipes by cooking time
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                String maxtime = scanner.nextLine();
                System.out.println("Recipes:");
                findTime(this.recipes, Integer.valueOf(maxtime));
            }
            // Finding recipes based on their ingredients
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String toFind = scanner.nextLine();
                System.out.println("Recipes:");
                findIngredient(this.recipes, toFind);
            }
            
            
            
            System.out.println("");
        }
    }
    
    public void list(ArrayList<Recipe> recipes) {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findName(ArrayList<Recipe> recipes, String toSearch) {
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(toSearch)) {
                System.out.println(recipe);
            } 
        }
    }
    
    public void findTime(ArrayList<Recipe> recipes, int maxtime) {
        for (Recipe recipe: recipes) {
            if (recipe.getCookingTime() <= maxtime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(ArrayList<Recipe> recipes, String toFind) {
        for (Recipe recipe: recipes) {
            if (recipe.getIngredients().contains(toFind)) {
                System.out.println(recipe);
            } 
        }
    }
   
}
