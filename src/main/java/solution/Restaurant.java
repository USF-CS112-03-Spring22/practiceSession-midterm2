package solution;

import java.io.IOException;
import java.io.PrintWriter;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("burrito", 9.05f);
        // Add ingredients: beans, rice, cheese
        item1.addIngredient("beans");
        item1.addIngredient("rice");
        item1.addIngredient("cheese");

        MenuItem item2 = new MenuItem("pizza", 12.25f);
        // Add ingredients: flour, sauce, cheese
        item2.addIngredient("flour");
        item2.addIngredient("sauce");
        item2.addIngredient("cheese");

        // Call compareTo to compare menu items and print which one is "smaller"
        int res = item1.compareTo(item2);
        if (res == 0) {
            System.out.println("Items are equal");
        }
        else if (res < 0) {
            System.out.println("The smaller item is burrito");
        }
        else
            System.out.println("The smaller item is pizza");

        /* Write all the menu items to a file "menu.txt"
           in the following format:

          burrito: beans, rice, cheese
          pizza: flour, sauce, cheese

         */
        try (PrintWriter pw = new PrintWriter("menu.txt")) {
            pw.println(item1);
            pw.println(item2);
            pw.flush();
        }
        catch (IOException e) {
            System.out.println("Cannot write to a file");
        }

    }
}