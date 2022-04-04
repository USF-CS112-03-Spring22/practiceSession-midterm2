import java.io.PrintWriter;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("burrito", 9.05f);
        // FILL IN CODE: add ingredients: beans, rice, cheese

        MenuItem item2 = new MenuItem("pizza", 12.25f);
        // FILL IN CODE: add ingredients: flour, sauce, cheese

        // FILL IN CODE: Call compareTo to compare menu items and print which one is "smaller"

        /* FILL IN CODE: Write all the menu items to a file "menu.txt"
           in the following format:

          burrito: beans, rice, cheese, salsa
          pizza: flour, sauce, cheese, mushrooms

         */
        PrintWriter pw;
        // FILL IN CODE: write to a file
        // Note: MenuItem class has a toString method you can use

    }
}