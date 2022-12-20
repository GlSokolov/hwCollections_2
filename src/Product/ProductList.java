package Product;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {
    private final Map<Product, Integer> products = new HashMap<>();
    int amount;
    public void add(Product product, int amount) {
        this.amount = amount;
        if (product==null){
            throw new IllegalArgumentException("Укажите продукт");
        } else if (amount < 1){
            this.products.put(product, 1);
        } else if (amount > 1){
            this.products.put(product, amount);
        }
    }



    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Продуктовый лист: "
                + products;
    }

    public int costProductList (){
        int totalCost=0;
        for (Map.Entry<Product, Integer> product: products.entrySet()){
            totalCost+=product.getKey().getPrice()*product.getValue();
        }
            return totalCost;
    }
}
