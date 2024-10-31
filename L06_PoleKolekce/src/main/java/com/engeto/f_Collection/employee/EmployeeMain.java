package com.engeto.f_Collection.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 55000));
        employees.add(new Employee("Bob", 47000));
        employees.add(new Employee("Charlie", 60000));
        employees.add(new Employee("Dana", 48000));

        // Seřazení zaměstnanců podle platu vzestupně
        Collections.sort(employees);

        // Výpis seřazeného seznamu
        System.out.println("Seřazený seznam zaměstnanců podle platu:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
