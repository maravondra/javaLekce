package org.example.c_sortArraylist.a_soringInMain;

class Person {

  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " (" + age + ")";
  }


  // musim udelat get
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
