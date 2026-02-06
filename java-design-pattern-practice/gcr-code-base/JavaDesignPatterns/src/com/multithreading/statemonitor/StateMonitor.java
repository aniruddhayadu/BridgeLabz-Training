package com.multithreading.statemonitor;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class StateMonitor extends Thread {

    private Thread t1;
    private Thread t2;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread t1, Thread t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void run() {

        boolean monitoring = true;

        while (monitoring) {
            monitorThread(t1);
            monitorThread(t2);

            if (t1.getState() == State.TERMINATED &&
                t2.getState() == State.TERMINATED) {
                monitoring = false;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted");
            }
        }

        System.out.println("\nSummary:");
        stateCount.forEach((k, v) ->
            System.out.println(k + " went through " + v + " states")
        );
    }

    private void monitorThread(Thread t) {
        String key = t.getName();
        State state = t.getState();

        System.out.println("[Monitor] " + t.getName() +
                " is in " + state +
                " state at " + LocalTime.now());

        stateCount.put(key, stateCount.getOrDefault(key, 0) + 1);
    }
}
