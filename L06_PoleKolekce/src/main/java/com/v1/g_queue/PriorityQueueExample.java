package com.v1.g_queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
    PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    taskQueue.add(new Task("Dokončit report", 2));
    taskQueue.add(new Task("Odpovědět na email", 4));
    taskQueue.add(new Task("Zálohovat data", 1));
    taskQueue.add(new Task("Naplánovat schůzku", 3));

    System.out.println("📋 Zpracování úkolů podle priority:");

    while (!taskQueue.isEmpty()) {
      Task task = taskQueue.poll();
      System.out.println("✅ Zpracovávám " + task);
    }
  }
}
