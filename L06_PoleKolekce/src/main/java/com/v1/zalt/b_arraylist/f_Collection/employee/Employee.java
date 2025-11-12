package com.v1.zalt.b_arraylist.f_Collection.employee;

public class Employee implements Comparable<Employee> {

  private final String name;
  private final double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  // Implementace metody compareTo pro řazení podle platu
  @Override
  public int compareTo(Employee other) {
    return Double.compare(this.salary, other.salary);
  }

  @Override
  public String toString() {
    return name + " - " + salary;
  }
}
