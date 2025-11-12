package com.v1.g_queue;

public class Task implements Comparable<Task> {

  private final String name;
  private final int priority; // Čím menší číslo, tím vyšší priorita

  public Task(String name, int priority) {
    this.name = name;
    this.priority = priority;
  }

  public String getName() {
    return name;
  }

  public int getPriority() {
    return priority;
  }

  @Override
  public int compareTo(Task other) {
    return Integer.compare(this.priority, other.priority);
  }

  @Override
  public String toString() {
    return "Úkol: " + name + ", priorita: " + priority;
  }
}
