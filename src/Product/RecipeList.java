package Product;

import java.util.HashSet;

public class RecipeList {
    private HashSet<Recipe> recipes = new HashSet<>();

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Рецепт с таким названием уже имеется");
        } else {recipes.add(recipe);}
    }

    @Override
    public String toString() {
        return "Продуктовый лист: "
                + recipes
                ;
    }
}
