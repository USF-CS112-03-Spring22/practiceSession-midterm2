package solution;

import java.util.*;

/** Represents an item in the menu in the restaurant, such as "fish taco",
 * or "veggie burger" or "cesar salad".
 */
public class MenuItem implements Comparable<MenuItem> {
    // Should compare menu items based on the # of ingredients;
    // if the number of ingredients are the same, should compare based on the name

    private String name;
    private float price;
    private ArrayList<String> ingredients;

    public MenuItem(String name, float price) {
        this.name = name;
        this.price = price;
        ingredients = new ArrayList<String>();
    }

    public void addIngredient(String ingred) {
        ingredients.add(ingred);
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
        for (String el : ingredients) {
            if (el.equals(ingredient))
                return true;

        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ": ");
        for (int i = 0; i < ingredients.size() - 1; i++) {
            sb.append(ingredients.get(i));
            sb.append(", ");
        }
        sb.append(ingredients.get(ingredients.size() - 1));
        return sb.toString();
    }

    @Override
    public int compareTo(MenuItem o) {
        if (this.ingredients.size() != o.ingredients.size())
            return this.ingredients.size() - o.ingredients.size();
        else
            return name.compareTo(o.name);
    }
}
