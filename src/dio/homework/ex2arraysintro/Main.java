package dio.homework.ex2arraysintro;
import dio.homework.ex1pojo.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Samsung S5660", 203, 20, 40, 2, 60, Category.SMARTPHONE);
        Product product2 = new Product("Samsung S5660", 203, 20, 40, 2, 60, Category.SMARTPHONE);
        Product product3 = new Product("Lenovo P780", 399.99, 30, 60, 2, 75, Category.SMARTPHONE);
        Product[] prods1 = new Product[] {product1, product2, product3};
        Product[] prods2 = new Product[] {product3, product2, product1};
        System.out.println("Elements from prods1: ");
        for (Product p : prods1)
            System.out.println(p);
        System.out.println("Elements from prods2: ");
        for (Product p : prods2)
            System.out.println(p);
        System.out.println("Compare elements: ");
        for (int i = 0; i<prods1.length; i++) {
            System.out.println("index = " + i + " " + prods1[i].equals(prods2[i]));
        }


    }
}
