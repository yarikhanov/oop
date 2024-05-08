package org.yarikhanov_khasan.programming_patterns.creational_patterns.factory_method;

public class Shop {
    public static void main(String[] args) {
        ProductFactory productFactory = createProductByName("a");
        Product product = productFactory.createProduct();
        product.use();
    }
    static ProductFactory createProductByName(String name) {
        return switch (name.toLowerCase()) {
            case "a" -> new ProductAFactory();
            case "b" -> new ProductBFactory();
            default -> throw new RuntimeException("unkhown prodcut");
        };
    }
}
