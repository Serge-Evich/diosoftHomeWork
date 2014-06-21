package dio.homework.ex1pojo;

/**
 * Created by Димон on 21.06.2014.
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Samsung S5660", 203, 20, 40, 2, 60, Category.SMARTPHONE);
        Product product2 = new Product("Samsung S5660", 203, 20, 40, 2, 60, Category.SMARTPHONE);
        Product product3 = new Product("Lenovo P780", 399.99, 30, 60, 2, 75, Category.SMARTPHONE);
        System.out.println("Compare with == ");
        System.out.println(product1 == product2);
        System.out.println(product1 == product3);
        System.out.println("Compare with equals()");
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
    }
}
