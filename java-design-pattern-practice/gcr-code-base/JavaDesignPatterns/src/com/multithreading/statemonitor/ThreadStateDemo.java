package com.multithreading.statemonitor;

public class ThreadStateDemo {

    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);

        // NEW state observed here
        monitor.start();

        task1.start();
        task2.start();
    }
}