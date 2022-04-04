package Aula09.program;

import Aula09.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Application2 {

    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product p = new Product("TV", 900.00);
        System.out.println("Contains 'p' key: " + stock.containsKey(p));

    }


}
