package org.yarikhanov_khasan.programming_patterns.creational_patterns.singleton;

public class Bill {

    private static Bill bill;
    private static String billInfo = "Welcome to JavaShop. \n";

    public synchronized static Bill getBill(){
        if (bill == null){
            bill = new Bill();
        }
        return bill;
    }

    private Bill(){}

    public void addProductInBill(String product) {
        billInfo += product + "\n";
    }

    public void printBill() {
        System.out.println(billInfo);
    }
}
