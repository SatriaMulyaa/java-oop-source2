package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class ProductApp {
    public static void main(String[] args) {


        Product product = new Product("Mac Book Pro", 10000000);

        System.out.println(product.name);
        System.out.println(product.price);

        Product product2 = new Product("Mac Book Pro", 10000000);
        System.out.println(product.equals(product2));
        System.out.println("product name1 " + product.name.hashCode());
        System.out.println("product name2 " + product2.name.hashCode());
        System.out.println(product.hashCode()==product2.hashCode());
    }
}
