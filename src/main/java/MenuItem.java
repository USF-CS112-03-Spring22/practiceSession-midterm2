import java.util.*;

/** Represents an item in the menu in the restaurant, such as "fish taco",
 * or "veggie burger" or "cesar salad".
 */
public class MenuItem  { // FILL IN CODE: must implement Comparable<MenuItem>
    // Should compare menu items based on the # of ingredients;
    // if the number of ingredients are the same, should compare based on the name

    private String name;
    private float price;
    private List<String> ingredients;

    public MenuItem(String name, float price) {
        this.name = name;
        this.price = price;
        // FILL IN CODE: initialize the ingredients ArrayList
    }

    /** Adds a given ingredient to the list of ingredients */
    public void addIngredient(String ingred) {
        // FILL IN CODE:
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }


    /** Returns true if the list of ingredients contains the given ingredient and
     * false otherwise. May NOT use contains, you need to iterate over the
     * list of ingredients and compare each element with igredient.
     * @param ingredient
     * @return
     */
    public boolean containsIngredient(String ingredient) {
        // FILL IN CODE
        return false; // change as needed
    }

    public String toString() {
        return name + ", $" + price + ",  " + ingredients.toString();
    }

    // FILL IN CODE: what method do you need to implement so that the class implements Comparable?
    // Menu items should be compared by the number of ingredients;
    // if the number of ingredients is the same, then compare based on the name

}
