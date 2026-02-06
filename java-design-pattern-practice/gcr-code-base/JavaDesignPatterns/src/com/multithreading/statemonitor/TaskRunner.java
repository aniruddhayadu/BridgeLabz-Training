
package com.multithreading.statemonitor;

public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {

        // RUNNABLE (computation)
        for (int i = 0; i < 1_000_000; i++) {
            int x = i * i;
        }

        // TIMED_WAITING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }

        // RUNNABLE again
        for (int i = 0; i < 1_000_000; i++) {
            int y = i + i;
        }
    }
}
