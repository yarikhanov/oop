package org.yarikhanov_khasan.programming_patterns.creational_patterns.factory_method;

public class ProductBFactory implements ProductFactory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
