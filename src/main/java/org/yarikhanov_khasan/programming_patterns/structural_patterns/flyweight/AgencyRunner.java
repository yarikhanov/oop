package org.yarikhanov_khasan.programming_patterns.structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AgencyRunner {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        List<Employee> employees = new ArrayList<>();

        employees.add(employeeFactory.getEmployee("painter"));
        employees.add(employeeFactory.getEmployee("painter"));
        employees.add(employeeFactory.getEmployee("painter"));
        employees.add(employeeFactory.getEmployee("plumber"));
        employees.add(employeeFactory.getEmployee("plumber"));
        employees.add(employeeFactory.getEmployee("plumber"));

        for (Employee e : employees){
            e.doJob();
        }
    }
}
