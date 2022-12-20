import Product.Product;
import Product.ProductList;
import Product.Recipe;
import Task3.Task3;

import java.util.*;

public class Main {
    public static void space(){
        System.out.println("==========================================================");
    }
    public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    phonebook.add("Слава", "++219198419");
    phonebook.add("Коля", "+096189498");
    phonebook.add("Петя", "+3289191");
    phonebook.add("Вася", "+2984198719");
    phonebook.add("Я", "+41946298");
    phonebook.add("Мама", "9812++589");
    phonebook.add("Папа", "+29841981");
    phonebook.add("Деда", "+5292198");
    phonebook.add("Баба", "+59841651");
    phonebook.add("Жена", "+235164");
    phonebook.add("Сват", "+982621984");
    phonebook.add("Зять", "+4198129");
    phonebook.add("Теща", "+98616198");
    phonebook.add("Дитё", "+52119848941");
    phonebook.add("Собака", "+296848949");
    phonebook.add("Кошка", "+8416518");
    phonebook.add("Сантехник", "+4191238");
    phonebook.add("Слесарь", "+846068");
    phonebook.add("Бездарь", "+196816518");
    phonebook.add("Мент", "+9618815188");


    System.out.println(phonebook);
space();
    Product[] products = new Product[10];
    products[0] = new Product(200, "Банан", 1000);
    products[1] = new Product(13, "Арбуз", 1000);
    products[2] = new Product(15, "Дыня", 1000);
    products[3] = new Product(240, "Хурма", 1000);
    products[4] = new Product(250, "Куринная грудка", 300);
    products[5] = new Product(150, "Помидоры", 1000);
    products[6] = new Product(110, "Огурцы", 1000);
    products[7] = new Product(230, "Фарш говяжий", 300);
    products[8] = new Product(80, "Голубика", 100);
    products[9] = new Product(40, "Орехи", 100);

    for (int i = 0; i < products.length; i++) {
        for (int j = i+1; j < products.length; j++) {
            if (products[i].equals(products[j])) {
                throw new RuntimeException("Созданы два одинаковых продукта");
            }
        }
    }
    HashSet<Product> productsList = new HashSet<>();
    productsList.add(products[0]);
    productsList.add(products[1]);
    productsList.add(products[2]);
    productsList.add(products[3]);
    productsList.add(products[4]);
    productsList.add(products[5]);
    productsList.add(products[6]);
    productsList.add(products[7]);
    productsList.add(products[8]);
    productsList.add(products[9]);
    productsList.remove(products[9]);

    ProductList productForCake = new ProductList();
    productForCake.add(products[0], 6);
    productForCake.add(products[9], 3);
        System.out.println(productForCake.costProductList());
    ProductList productForSalad = new ProductList();
    productForSalad.add(products[5], 0);
    productForSalad.add(products[6],0);

    Recipe cakeRecipe = new Recipe("Банановый кекс с орехами", productForCake, 240);
    Recipe saladRecipe = new Recipe("Салат обычный", productForSalad, 210);
    HashSet<Recipe> recipes = new HashSet<>();
    recipes.add(cakeRecipe);
    recipes.add(saladRecipe);
    System.out.println(recipes);
//    System.out.printf(Arrays.toString(productsList.toArray()));
//    System.out.printf(Arrays.toString(products));

space();

    Task3 list = new Task3();
    list.add("str1",2);
    list.add("str2",1);
//    list.add("str1",2);
    list.add("str1",5);
    System.out.println(list);
space();
        task2_1();
space();
        task2_2();

    }


    public static void task2_1(){
        HashMap<String, List<Integer>> list1 = new HashMap<>();
        list1.put("str1", List.of(15,35,45));
        list1.put("str2", List.of(123,215,523));
        list1.put("str3", List.of(131,516,156));
        list1.put("str4", List.of(165,589,777));
        list1.put("str5", List.of(777,888,999));

        Map<String, Integer> list2 = new HashMap<>();
        for (Map.Entry<String,List<Integer>> stringListEntry: list1.entrySet()) {
            list2.put(stringListEntry.getKey(),sumNum(stringListEntry.getValue()));

        }

        System.out.println(list1);
        System.out.println(list2);



    }
    public static int sumNum(List<Integer> list){
        int sum = 0;
        for (int num : list) {
            sum+= num;
        }
        return sum;
    }

    public static void task2_2(){
        Map<Integer,String> num = new LinkedHashMap<>();
        num.put(1,"а");
        num.put(2,"б");
        num.put(3,"в");
        num.put(4,"г");
        num.put(5,"д");
        num.put(6,"е");
        num.put(7,"ё");
        num.put(8,"ж");
        num.put(9,"з");
        num.put(0,"и");

        System.out.println(num);
    }

}