package Product;

import java.util.Map;
import java.util.Objects;

public class Recipe extends ProductList{
    private final String recipeName;
    private final ProductList productList;
    private final int costProductsRecipe;

    public Recipe(String recipeName, ProductList productList, int costProductsRecipe) {
        this.recipeName = recipeName;
        this.productList = productList;
        this.costProductsRecipe = productList.costProductList();
    }

    public String getRecipeName() {
        return recipeName;
    }
    public ProductList getProductList() {
        return productList;
    }
    public int getCostProductsRecipe() {
        return costProductsRecipe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return "Рецепт: " + recipeName + ", " + productList +
                ", Стоимость рецепта = " + costProductsRecipe +
                "руб. | ";
    }

}
