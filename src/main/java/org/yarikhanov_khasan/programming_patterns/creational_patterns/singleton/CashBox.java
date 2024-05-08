package org.yarikhanov_khasan.programming_patterns.creational_patterns.singleton;

public class CashBox {
    public static void main(String[] args) {
        Bill.getBill().addProductInBill("Orange");
        Bill.getBill().addProductInBill("Apple");
        Bill.getBill().addProductInBill("Banana");

        Bill.getBill().printBill();
    }
}
