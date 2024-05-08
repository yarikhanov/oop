package org.yarikhanov_khasan.programming_patterns.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String, Employee> employees = new HashMap<>();

    public Employee getEmployee(String speciality) {
        Employee employee = employees.get(speciality);

        if (employee == null) {
            switch (speciality){
                case "plumber":
                    System.out.println("Plumber is hiring");
                    employee = new Plumber();
                    break;
                case "painter":
                    System.out.println("Painter is hiring");
                    employee = new Painter();
            }
            employees.put(speciality, employee);
        }
        return employee;
    }
}
